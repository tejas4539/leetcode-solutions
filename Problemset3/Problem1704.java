import java.util.ArrayList;
import java.util.List;

class Problem1704 {
    public boolean halvesAreAlike(String s) {
        List<Character> li = new ArrayList<>();
        li.add('a');
        li.add('e');
        li.add('i');
        li.add('o');
        li.add('u');

        int count1 = 0;
        int count2 = 0;

        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if (li.contains(c)) {
                count1++;
            }
        }
        for (int i = n / 2; i < n; i++) {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if (li.contains(c)) {
                count2++;
            }
        }
        return count1 == count2;
    }
}