import java.util.*;

class Solution {
    private static final int SZ = 63333;
    private static final int OFFSET = SZ - 10;

    // Class to represent the Binary Indexed Tree (BIT)
    static class BIT {
        int[] bs = new int[SZ];

        // Update BIT: add value y to index x
        void update(int x, int y) {
            x = OFFSET - x;
            for (; x < SZ; x += x & -x) {
                bs[x] += y;
            }
        }

        // Query BIT: get the prefix sum up to index x
        int query(int x) {
            x = OFFSET - x;
            int ans = 0;
            for (; x > 0; x -= x & -x) {
                ans += bs[x];
            }
            return ans;
        }

        // Clear BIT values up to index x
        void clear(int x) {
            x = OFFSET - x;
            for (; x < SZ; x += x & -x) {
                bs[x] = 0;
            }
        }
    }

    static BIT[] B = { new BIT(), new BIT() };

    // Wrapper functions for updating and querying the BITs
    static void edt(int x, int y) {
        B[1].update(x, x * y); // Update second BIT with product of index and value
        B[0].update(x, y);     // Update first BIT with value
    }

    static int qry(int x) {
        return B[1].query(x) + (1 - x) * B[0].query(x); // Query BITs and combine results
    }

    // Function to calculate the length between two indices
    static int len(int x, int y) {
        return y - x + 1;
    }

    // Overloaded function to calculate length for a pair
    static int len(Map.Entry<Integer, Integer> s) {
        return len(s.getKey(), s.getValue());
    }

    // Main function to handle the queries
    public List<Integer> numberOfAlternatingGroups(int[] colors, int[][] queries) {
        TreeMap<Integer, Integer> C = new TreeMap<>(); // Map to store start and end indices of alternating groups
        int n = colors.length;

        // Initialize alternating groups
        for (int i = 0; i < colors.length; ++i) {
            int r = i;
            // Find end of the current alternating group
            while (r < colors.length && (colors[r] + colors[i] + r + i) % 2 == 0) {
                ++r;
            }
            C.put(i, r - 1); // Store group boundaries in map
            edt(r - i, 1); // Update BITs with new group
            i = r - 1;     // Move to the end of the current group
        }

        List<Integer> results = new ArrayList<>(); // List to store results for type 1 queries

        // Process each query
        for (int[] q : queries) {
            if (q[0] == 1) { // Query type 1: Count alternating groups of a given size
                int ans = qry(q[1]);
                Map.Entry<Integer, Integer> A = C.firstEntry(), B = C.lastEntry();
                if (A != B) {
                    // Check if merging groups is possible
                    if (colors[0] != colors[colors.length - 1]) {
                        int l1 = len(A.getKey(), A.getValue());
                        int l2 = len(B.getKey(), B.getValue());
                        ans -= Math.max(l1 - q[1] + 1, 0); // Subtract groups that are too small
                        ans -= Math.max(l2 - q[1] + 1, 0);
                        ans += Math.max(l1 + l2 - q[1] + 1, 0); // Add merged group size
                    }
                } else if (colors[0] != colors[colors.length - 1]) {
                    ans = n; // If there's only one group, check if it can span the entire array
                }
                results.add(ans); // Store result for type 1 query
            } else { // Query type 2: Update color at a given index
                int x = q[1], y = q[2];
                if (colors[x] == y) {
                    continue; // If color is already correct, skip update
                }
                colors[x] = y; // Update color
                // Find the block containing index x
                Map.Entry<Integer, Integer> it = C.floorEntry(x);
                assert it != null && it.getKey() <= x && it.getValue() >= x;
                int L = it.getKey(), R = it.getValue();
                edt(len(it.getKey(), it.getValue()), -1); // Remove the old block
                C.remove(it.getKey());
                int ML = x, MR = x;
                // Update or split the affected blocks
                if (L != ML) {
                    C.put(L, x - 1);
                    edt(len(L, x - 1), 1);
                } else {
                    if (x > 0 && colors[x] != colors[x - 1]) {
                        it = C.floorEntry(x - 1);
                        if (it != null) {
                            ML = it.getKey();
                            edt(len(it.getKey(), it.getValue()), -1);
                            C.remove(it.getKey());
                        }
                    }
                }
                if (R != MR) {
                    C.put(x + 1, R);
                    edt(len(x + 1, R), 1);
                } else {
                    if (x + 1 < colors.length && colors[x + 1] != colors[x]) {
                        it = C.ceilingEntry(x + 1);
                        if (it != null) {
                            MR = it.getValue();
                            edt(len(it.getKey(), it.getValue()), -1);
                            C.remove(it.getKey());
                        }
                    }
                }
                C.put(ML, MR);
                edt(len(ML, MR), 1); // Add new or modified block
            }
        }

        // Clear BITs after processing all queries
        for (int i = 0; i <= n + 2; ++i) {
            B[0].clear(i);
            B[1].clear(i);
        }

        return results; // Return results for type 1 queries
    }
  
}