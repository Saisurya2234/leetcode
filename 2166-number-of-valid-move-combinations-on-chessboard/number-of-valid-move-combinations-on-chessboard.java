class Solution {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}, {0, 0}};
    int ans = 0;
    public int countCombinations(String[] pieces, int[][] positions) {
        List<List<int[]>> list = new ArrayList<>();
        for (int i = 0; i < pieces.length; ++i) {
            List<int[]> me = new ArrayList<>();
            int r = positions[i][0], c = positions[i][1];
            me.add(new int[]{8, 0});
            if (pieces[i].equals("rook") || pieces[i].equals("queen") ) {
                for (int j = 0; j < 4; ++j) {
                    for (int step = 1; step <= 7; ++step) {
                        int r1 = r + dirs[j][0] * step, c1 = c + dirs[j][1] * step;
                        if (isValid(r1, c1)) me.add(new int[]{j, step});
                        else break; 
                    }         
                }
            }
            if (pieces[i].equals("bishop") || pieces[i].equals("queen") ) {
                for (int j = 4; j < 8; ++j) {
                    for (int step = 1; step <= 7; ++step) {
                        int r1 = r + dirs[j][0] * step, c1 = c + dirs[j][1] * step;
                        if (isValid(r1, c1)) me.add(new int[]{j, step});
                        else break; 
                    }
                }
            }
            list.add(me);    
        }
        if (1 == pieces.length) return list.get(0).size();
        backtracing(list, 0, new ArrayList<>(), positions);
        return ans;
    }

    private boolean isValid(int r, int c) {
        if (r < 1 || r > 8 || c < 1 || c > 8) return false;
        return true;
    }

    private void backtracing(List<List<int[]>> list, int index, List<int[]> path, int[][] positions) {
        if (index == list.size()) {
            if (noCollison(path, positions)) ans++;
            return;
        }
        for (int[] i : list.get(index)) {
            path.add(i);
            backtracing(list, index + 1, path, positions);
            path.remove(path.size() - 1);
        }
    }

    private boolean noCollison(List<int[]> path, int[][] positions) {
        Set<Integer> hs = new HashSet<>();
        for (int step = 1; step <= 7; ++step) {
            hs.clear();
            int arrived = 0;
            for (int i = 0; i < path.size(); ++i) {
                int r = positions[i][0], c = positions[i][1];
                int j = path.get(i)[0], maxStep = path.get(i)[1];
                int r1 = r + dirs[j][0] * Math.min(maxStep, step), c1 = c + dirs[j][1] * Math.min(maxStep, step);
                hs.add(r1 * 8 + c1);
                if (step >= path.get(i)[1]) arrived++;
            }
            if (hs.size() != path.size()) {
                return false;
            }
            if (arrived == path.size()) return true;
        }
        return true;
    }
}