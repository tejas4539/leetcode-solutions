import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        List<Integer> li1 = new ArrayList<>();
        for (int n : nums1) {
            if (!set2.contains(n) && !li1.contains(n)) {
                li1.add(n);
            }
        }
        List<Integer> li2 = new ArrayList<>();
        for (int n : nums2) {
            if (!set1.contains(n) && !li2.contains(n)) {
                li2.add(n);
            }
        }
        return Arrays.asList(li1, li2);
    }
}
