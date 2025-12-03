public class Problem1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int k = 0;
        int l = n;
        int i = 0;
        while (i < res.length) {
            res[i] = nums[k];
            i++;
            res[i] = nums[l];
            l++;
            k++;
            i++;
        }
        return res;
    }
}
