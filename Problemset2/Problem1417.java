public class Problem1417 {
    public String reformat(String s) {
        if (s.length() == 1)
            return s;
        List<Character> digit = new ArrayList<>();
        List<Character> letter = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digit.add(c);
            } else {
                letter.add(c);
            }
        }
        int digitSize = digit.size();
        int letterSize = letter.size();
        if (letterSize - digitSize == 0 || letterSize - digitSize == 1 || letterSize - digitSize == -1) {
            StringBuilder sb = new StringBuilder();
            if (digitSize > letterSize) {
               while(digitSize>0 ){
                   sb.append(digit.get(digitSize-1));
                   if(letterSize>0){
                       sb.append(letter.get(letterSize-1));
                       letterSize--;
                   }
                   
                   digitSize--;
                   
               }
               return sb.toString();
            } else {
               while(letterSize>0){
                   sb.append(letter.get(letterSize-1));
                   if(digitSize>0){
                     sb.append(digit.get(digitSize-1));
                      digitSize--;
                   }
                   
                   letterSize--;
                   
               }
               return sb.toString();
            }
        }
        return "";
    }
}
