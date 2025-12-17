import java.util.ArrayList;
class Problem169{
     public int majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int n : nums) {
            al.add(n);
        }
        Collections.sort(al);
        int max = al.size() / 2;
        return al.get(max);
    }
}