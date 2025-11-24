public class Problem1317 {
    public int[] getNoZeroIntegers(int n) {

        for (int i = 1; i < n; i++) {
            int b = n - i;
            String s1 = Integer.toString(i);
            String s2 = Integer.toString(b);
            boolean first = true;
            boolean second = true;
            for (Character s : s1.toCharArray()) {
                if (s == '0') {
                    first = false;
                    break;
                }
            }
            if (!first)
                continue;
            for (Character s : s2.toCharArray()) {
                if (s == '0') {
                    second = false;
                    break;
                }
            }
            if (!second)
                continue;

            return new int[] { i, b };
        }

        return new int[] { 1, n - 1 };
    }
}
