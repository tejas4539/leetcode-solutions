import java.util.HashSet;
import java.util.Set;

public class Problem929 {
     public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String mails : emails) {
            String[] words = mails.split("@");
            words[0] = words[0].replace(".", "");
            int index = words[0].indexOf("+");
            if (index >= 0) {  
                words[0] = words[0].substring(0,index);
            }
            String s = words[0] + "@" + words[1];
            set.add(s);
        }
        return set.size();
    }
}
