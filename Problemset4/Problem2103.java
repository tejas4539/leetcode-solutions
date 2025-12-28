public class Problem2103 {
    public int countPoints(String rings) {
        int n = rings.length();
        if (n < 6)
            return 0;
        boolean[] red = new boolean[10];
        boolean[] blue = new boolean[10];
        boolean[] green = new boolean[10];
        for (int i = 1; i < n; i += 2) {
            int num = rings.charAt(i) - '0';
            char color = rings.charAt(i - 1);
            if (color == 'R') {
                red[num] = true;
            } else if (color == 'B') {
                blue[num] = true;
            } else {
                green[num] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (blue[i] && red[i] && green[i]) {
                count++;
            }
        }
        return count;
    }
}
