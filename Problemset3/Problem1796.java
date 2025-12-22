import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1796 {
    public int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int a = s.charAt(i) - '0';
                if (!list.contains(a)) {
                    list.add(a);
                }
            }
        }
        if (list.size() <= 1) {
            return -1;
        }
        Collections.sort(list);
        return list.get(list.size() - 2);
    }
}
