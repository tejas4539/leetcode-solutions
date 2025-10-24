class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] ch = jewels.toCharArray();
        ArrayList<Character> al = new ArrayList<>();
        for (char c : ch) {
            al.add(c);
        }
        char[] ch2 = stones.toCharArray();
        for (char c : ch2) {
            if (al.contains(c))
                count++;
        }
        return count;
    }

}