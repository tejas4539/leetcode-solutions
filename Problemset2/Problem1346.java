import java.util.ArrayList;
import java.util.List;

public class Problem1346 {
    public boolean checkIfExist(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(2 * arr[i])) {
                return true;
            }
            if (arr[i] % 2 == 0 && list.contains(arr[i] / 2)) {
                return true;
            }
            list.add(arr[i]);
        }
        return false;
    }
}
