class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 1)
            return 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        if (map.size() == 1)
            return map.get(s.charAt(0));
        int count = 0;
        boolean hasodd=false;
        System.out.println(map);
        for (int value : map.values()) {
            if (value % 2 == 0) {
                count += value;
            } else {
                count+=value-1;
                hasodd=true;
            }
        }
        if (hasodd) count += 1;
        return count;
    }
}