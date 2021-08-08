package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    Map<Character, Integer> romanNums = new HashMap<Character, Integer>();

    public int romanToInt(String s) {
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            int curr = romanNums.get(s.charAt(i));
            if(i < s.length() - 1 && curr < romanNums.get(s.charAt(i + 1))) {
                num -= curr;
            } else {
                num += curr;
            }
        }
        return num;
    }
}
