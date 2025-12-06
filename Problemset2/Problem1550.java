public class Problem1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 2)
            return false;
        int i = 0;
        int j = 1;
        int k = 2;
        for (int l = 0; l < arr.length - 2; l++) {
            if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[k] % 2 != 0) {
                return true;
            }
            i++;
            j++;
            k++;
        }
        return false;
    }
}
