public class Problem1528 {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        String res[] = new String[s.length()];
        for (int i = 0; i < indices.length; i++) {
            int pos = indices[i];
            res[pos] = s.charAt(i) + "";

        }
        for (String str : res) {
            sb.append(str);
        }
        return sb.toString();
    }
}
