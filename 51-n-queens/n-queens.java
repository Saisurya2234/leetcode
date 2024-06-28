import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(n, 0, board, result);
        return result;
    }

    private boolean diup(char[][] arr, int row, int col) {
        int i = row;
        int j = col;
        while (i >= 0 && j >= 0) {
            if (arr[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    private boolean dilinear(char[][] arr, int row, int col) {
        int i = row;
        int j = col;
        while (j >= 0) {
            if (arr[i][j] == 'Q') {
                return false;
            }
            j--;
        }
        return true;
    }

    private boolean didown(char[][] arr, int row, int col, int n) {
        int i = row;
        int j = col;
        while (i < n && j >= 0) {
            if (arr[i][j] == 'Q') {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }

    private void solve(int n, int col, char[][] arr, List<List<String>> result) {
        if (col == n) {
            result.add(construct(arr));
            return;
        }
        for (int row = 0; row < n; row++) {
            if (didown(arr, row, col, n) && dilinear(arr, row, col) && diup(arr, row, col)) {
                arr[row][col] = 'Q';
                solve(n, col + 1, arr, result);
                arr[row][col] = '.';
            }
        }
    }

    private List<String> construct(char[][] arr) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            res.add(new String(arr[i]));
        }
        return res;
    }
}