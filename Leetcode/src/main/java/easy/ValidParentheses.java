package easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s == null || s.isEmpty())
            return true;
        if(s.length() % 2 != 0)
            return false;

        Map<Character, Character> parenthese = new HashMap<Character, Character>();
        parenthese.put(')', '(');
        parenthese.put(']', '[');
        parenthese.put('}', '{');

        Deque<Character> dq = new ArrayDeque<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                dq.push(s.charAt(i));
            } else {
                if(dq.size() == 0 || dq.pop() != parenthese.get(s.charAt(i))){
                    return false;
                }
            }
        }
        return dq.size() == 0;
    }
}
