class Solution {
    public boolean checkRecord(String s) {
        char[] ch = s.toCharArray();
        int countA = 0;
        int countL = 0;
        for (char c : ch) {
            if (c == 'L') {
                countL++;
                if (countL >= 3) {
                    return false;
                }
            } else if (c == 'A') {
                countA++;
                if (countA > 1) {
                    return false;
                }
                countL = 0;

            } else {
                countL = 0;
            }

        }
        return true;
    }
}