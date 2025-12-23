package Problemset4;

public class Problem1903 {
    public String largestOddNumber(String num) {
        int a;
        for (int i = num.length() - 1; i >= 0; i--) {
            a = num.charAt(i) - '0';
            if (a % 2 != 0) {
                if (i == num.length() - 1)
                    return num;
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
