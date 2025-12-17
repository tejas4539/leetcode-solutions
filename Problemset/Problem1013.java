public class Problem1013 {
     public boolean canThreePartsEqualSum(int[] arr) {
       int sum = 0;
        for (int n : arr) sum += n;

        if (sum % 3 != 0) return false;

        int target = sum / 3;
        int temp = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (temp == target) {
                count++;
                temp = 0;
                if (count == 2 && i < arr.length - 1) {  
                    // Found 2 parts; the remaining must be the 3rd
                    return true;
                }
            }
        }
        return false;
    }
}
