public class Problem2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] newarr = new int[m][n];
        if (m * n != original.length)
            return new int[][] {};

        int count = 0;
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newarr[i][j] = original[k];
                k++;
            }
        }
        return newarr;
    }
}
