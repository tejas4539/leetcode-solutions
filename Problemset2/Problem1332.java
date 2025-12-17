public class Problem1332 {
    public int removePalindromeSub(String s) {
        return isPalindrome(s);
    }

    public static int isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (sb.toString().equals(s)) {
            return 1;
        } else {
            return 2;
        }
    }
}
