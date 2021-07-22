package easy;

/**
 * https://leetcode-cn.com/problems/valid-anagram/h
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen != tlen) {
            return false;
        }

        int[] arr = new int[26];
        for(int i = 0; i < slen; i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for(int j = 0; j < tlen; j++) {
            arr[t.charAt(j) - 'a']--;
            if(arr[t.charAt(j) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
