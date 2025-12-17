import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1507 {
    public String reformatDate(String date) {
        String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        List<String> list = new ArrayList<>(Arrays.asList(month));
        String[] words = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(words[2] + "-");
        int index = list.indexOf(words[1]);
        if (index < 9) {
            sb.append(0 + "" + (index + 1) + "-");
        } else {
            sb.append((index + 1) + "-");
        }

        if (Character.isDigit(words[0].charAt(1))) {
            sb.append(words[0].charAt(0) + "" + words[0].charAt(1));
        } else {
            sb.append(0 + "" + words[0].charAt(0));
        }
        return sb.toString();
    }
}
