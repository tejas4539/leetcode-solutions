class Problem806 {
    public int[] numberOfLines(int[] widths, String s) {
        int countLine = 1;
        int w = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            res += widths[c - 97];
            if (res > 100) {
                countLine++;
                w = 0;
                res = widths[c - 97];
            }
            w += widths[c - 97];
        }
        return new int[] { countLine, w };
    }
}