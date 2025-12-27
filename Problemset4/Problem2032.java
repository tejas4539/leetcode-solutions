import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList()<>();
        Set<Integer> set1 = new HashSet()<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums3) {
            set3.add(n);

        }
        Set<Integer> set4 = new HashSet<>();
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        set4.addAll(temp);

        temp = new HashSet<>(set1);
        temp.retainAll(set3);
        set4.addAll(temp);

        temp = new HashSet<>(set3);
        temp.retainAll(set2);
        set4.addAll(temp);

        for (int n : set4) {
            list.add(n);
        }
        return list;

    }
}
