public class Problem1736 {
     public String maximumTime(String time) {
        StringBuilder sb=new StringBuilder();
        int n=time.length();
        for(int i=0;i<n;i++){
            if(time.charAt(i)=='?'){
                if(i==0){
                    if(time.charAt(i+1)=='?'){
                        sb.append("2");
                    }else{
                        int a=time.charAt(i+1)-'0';
                    System.out.println(a);
                    if(a==0||a==1 || a==2 || a==3){
                         sb.append("2");
                    }
                    else{
                        sb.append("1");  
                    }
                    }
                 
                }else if(i==n-1){
                    sb.append("9");
                }
                else if(i==1){
                    if(sb.charAt(i-1)=='2'){
                        sb.append("3");
                    }
                    else{
                        sb.append("9");
                    }
                }
                else{
                    sb.append("5");
                }
            }else{
                sb.append(time.charAt(i));
            }
            
        }
     return sb.toString();   
    }
    
}
