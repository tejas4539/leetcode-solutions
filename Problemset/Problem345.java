class Solution {
     public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // handle both uppercase and lowercase
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public String reverseVowels(String s) { 
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
             if (!isVowel(ch[left])) {
                left++;
            } else if (!isVowel(ch[right])) {
                right--;
            } else {
                // both are vowels → swap
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        String str = new String(ch);
        return str;
    }
}