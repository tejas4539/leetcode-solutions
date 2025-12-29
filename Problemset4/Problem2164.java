import java.util.Arrays;

public class Problem2164 {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int even = n / 2;
        if (n % 2 != 0) {
            even = (n + 1) / 2;
        }
        int[] arr1 = new int[n / 2];
        int[] arr2 = new int[even];
        int j = 0;
        int l = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr2[j] = nums[i];
                j++;
            } else {
                arr1[l] = nums[i];
                l++;
            }
        }
        int k = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = arr2[m];
                m++;
            } else {
                nums[i] = arr1[k - 1];
                k--;
            }
        }
        return nums;

    }
}
