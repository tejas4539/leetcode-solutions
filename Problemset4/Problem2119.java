public class Problem2119 {
    public boolean isSameAfterReversals(int num) {
        int dup = num;
        while (dup != 0 && dup % 10 == 0) {
            dup = dup / 10;
        }
        return dup == num;
    }
}
