package Problemset4;

class Problem1837 {
    public int sumBase(int n, int k) {
        String s = Integer.toString(n, k);
        int sum = 0;
        int a;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i) - '0';
            sum += a;
        }
        return sum;
    }
}
