import java.util.ArrayList;
import java.util.List;

public class Problem1078 {
     public String[] findOcurrences(String text, String first, String second) {
        String[] words=text.split(" ");
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(i<words.length-2 && words[i].equals(first) && words[i+1].equals(second)){
                li.add(words[i+2]);
            }
        }
        return li.toArray(new String[0]);
    }
}
