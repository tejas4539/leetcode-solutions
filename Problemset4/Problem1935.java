public class Problem1935 {
     public int canBeTypedWords(String text, String brokenLetters) {
          int count=0;
          String[] words=text.split(" ");
          int n=brokenLetters.length();
          for(int i=0;i<words.length;i++){
           
            int j=0;
            boolean canMake=true;
            while(j<n){
              char c=brokenLetters.charAt(j);
              if(words[i].contains(String.valueOf(c))){
                canMake=false;
              }
              j++;
            }
            if(canMake){
                count++;
            }
          }
          return count;
    }
}
