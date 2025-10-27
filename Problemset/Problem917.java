public class Problem917 {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length - 1;
        int i = 0;
        while (i < n) {
            if (!Character.isLetter(ch[i])) {
                i++;
                continue;
            }
            if (!Character.isLetter(ch[n])) {
                n--;
                continue;
            }

            char c = ch[i];
            ch[i] = ch[n];
            ch[n] = c;

            i++;
            n--;
        }
        s = new String(ch);
        return s;
    }
}
