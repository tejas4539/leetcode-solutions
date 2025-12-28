import java.util.ArrayList;
import java.util.List;

public class Problem2138 {
    class Solution {
        public String[] divideString(String s, int k, char fill) {
            List<String> res = new ArrayList<>();
            int n = s.length();
            if (n % k != 0) {
                int need = k - (n % k);
                StringBuilder temp = new StringBuilder(s);
                for (int i = 0; i < need; i++) {
                    temp.append(fill);
                }
                s = temp.toString();
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                if (sb.length() == k) {
                    res.add(sb.toString());
                    sb.setLength(0);
                }
            }
            String[] ans = new String[res.size()];
            for (int i = 0; i < res.size(); i++) {
                ans[i] = res.get(i);
            }
            return ans;

        }
    }
}
