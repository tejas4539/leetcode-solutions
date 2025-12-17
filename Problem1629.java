public class Problem1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char longPressKey = keysPressed.charAt(0);
        int longdist = releaseTimes[0];
        int dist = releaseTimes[0];
        for (int i = 1; i < keysPressed.length(); i++) {
            dist = releaseTimes[i] - dist;
            char lex = keysPressed.charAt(i);
            if (dist == longdist && lex > longPressKey) {
                longPressKey = lex;
            } else if (dist > longdist) {
                longPressKey = lex;
                longdist = dist;
            }

            dist = releaseTimes[i];

        }
        return longPressKey;
    }
}
