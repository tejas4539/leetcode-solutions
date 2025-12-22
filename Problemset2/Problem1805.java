import java.util.HashSet;
import java.util.Set;

public class Problem1805 {
    public int numDifferentIntegers(String word) {
        String[] numbers = word.replaceAll("^\\D+", "").split("\\D+");
        int n=word.length();
        if(numbers.length==1 && numbers[0]=="")return 0;
        else if(numbers.length==1) {return 1;}
        Set<String> set=new HashSet<>();
        int num;
        for(int i=0;i<numbers.length;i++){
            StringBuilder sb=new StringBuilder(numbers[i]);
            System.out.println(sb.toString());
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)=='0'){
                   sb.deleteCharAt(j); 
                   j--;
                }else{
                    break;
                }
            }
             set.add(sb.toString());
        }
        return set.size();
    }
}
