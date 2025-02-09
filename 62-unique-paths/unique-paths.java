import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return solve(0, 0, m, n, dp);
    }

    public int solve(int i, int j, int m, int n, int[][] dp) {
        if (i >= n || j >= m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        dp[i][j] = solve(i + 1, j, m, n, dp) + solve(i, j + 1, m, n, dp);

        return dp[i][j];
    }
}
