package Problemset4;

public class Problem2373 {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = 0;

                for (int r = i; r < i + 3; r++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(grid[r][l], max);
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
}
