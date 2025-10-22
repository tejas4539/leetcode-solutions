class Problem821 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        int min=Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (s.charAt(k) == c) {
                   min=Math.min(min, Math.abs(k - j));
                }
            }
            res[j] = min;
            min=Integer.MAX_VALUE;
        }
        
        return res;
    }
}