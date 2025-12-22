public class Problem1791 {
    public int findCenter(int[][] edges) {
        int a1 = edges[0][0];
        int a2 = edges[0][1];

        if (a1 == edges[1][0] || a1 == edges[1][1]) {
            return a1;
        } else {
            return a2;
        }
    }
}
