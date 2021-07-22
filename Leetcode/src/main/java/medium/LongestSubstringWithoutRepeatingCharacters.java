package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()) return 0;

        int[] length = new int[26];
        for(char a : s.toCharArray()) {
            length[a]++;
        }

        int longestLength = 0;
        for(int i = 0; i < 26; i++) {
            if(length[i] > longestLength) {
                longestLength = length[i];
            }
        }
        return longestLength;
    }
}
