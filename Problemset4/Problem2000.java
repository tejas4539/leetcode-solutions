public class Problem2000 {
     public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch))) return word;
        int index=word.indexOf(ch);
        StringBuilder sb=new StringBuilder();
        for(int i=index;i>=0;i--){
          sb.append(word.charAt(i));
        }
        for(int i=index+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
