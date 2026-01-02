package Problemset4;

import java.util.ArrayList;
import java.util.List;

public class Problem2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> li = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (i != 0 && isAnagram(words[i - 1], words[i])) {
                continue;
            }
            li.add(words[i]);
        }
        return li;
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int freq[] = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            freq[c - 'a']--;
        }
        for (int f : freq) {
            if (f != 0)
                return false;
        }
        return true;
    }
}
