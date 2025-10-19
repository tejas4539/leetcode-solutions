import java.util.*;

class Problem804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        Set<String> set=new HashSet<>();
        for(String word:words){
            StringBuilder sb=new StringBuilder();
            for(Character c:word.toCharArray()){
              sb.append(code[c-'a']);  
            }
            set.add(sb.toString());
        }
     return set.size();
    }
}