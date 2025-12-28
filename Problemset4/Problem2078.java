public class Problem2078 {
    public int maxDistance(int[] colors) {
        int maxDiff = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    int diff = Math.abs(i - j);
                    maxDiff = Math.max(diff, maxDiff);
                }
            }
        }
        return maxDiff;
    }
}
