public class Problem2180 {
    public int countEven(int num) {
        int i = 1;
        int count = 0;
        while (i <= num) {
            int a = i;
            int sum = 0;
            while (a != 0) {
                int res = a % 10;
                sum += res;
                a = a / 10;
            }
            if (sum % 2 == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
