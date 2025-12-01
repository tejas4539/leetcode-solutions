import java.util.ArrayList;
import java.util.List;

public class Problem1408 {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            for (String s : words) {
                if (s.contains(words[i]) && !s.equals(words[i]) && !list.contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
            i++;
        }
        return list;
    }
}
