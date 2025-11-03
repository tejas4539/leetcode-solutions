import java.util.Arrays;
import java.util.Collections;

public class Problem976 {
    public int largestPerimeter(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length - 2; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int c = arr[i + 2];

            
            if (b + c > a) {
                return a + b + c; 
            }
        }
        return 0;
    }
}
