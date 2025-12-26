public class Problem2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            if (s.equals("--X")) {
                --x;
            } else if (s.equals("++X")) {
                ++x;
            } else if (s.equals("X--")) {
                x--;
            } else if (s.equals("X++")) {
                x++;
            }

        }
        return x;
    }
}
