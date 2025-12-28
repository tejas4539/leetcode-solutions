public class Problem2129 {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] words = title.split(" ");
        int i = 0;
        for (String s : words) {
            if (i != 0)
                sb.append(" ");
            if (s.length() < 3) {
                sb.append(s.toLowerCase());
            } else {
                sb.append(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
            }
            i++;
        }
        return sb.toString();
    }
}
