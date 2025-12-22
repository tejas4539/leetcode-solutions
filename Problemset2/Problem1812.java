public class Problem1812 {
    public boolean squareIsWhite(String coordinates) {
        char a1 = coordinates.charAt(0);
        char a2 = coordinates.charAt(1);
        int a = a2 - '0';
        if ((a1 == 'a' || a1 == 'c' || a1 == 'e' || a1 == 'g') && a % 2 == 0) {
            return true;
        } else if ((a1 == 'b' || a1 == 'd' || a1 == 'f' || a1 == 'h') && a % 2 != 0) {
            return true;
        }
        return false;

    }
}
