package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(s == null || s.isEmpty() || numRows == 1){
            return s;
        }

        List<StringBuffer> str = new ArrayList<StringBuffer>();
        for(int i = 0; i < numRows; i++){
            str.add(new StringBuffer());
        }

        int dir = 1;
        int idx = 0;
        for(char a : s.toCharArray()){
            str.get(idx).append(a);
            idx += dir;
            if(idx == numRows - 1 || idx == 0){
                dir = - dir;
            }
        }

        StringBuffer ret = new StringBuffer();
        for(int i = 0; i < str.size(); i++){
            ret.append(str.get(i));
        }

        return ret.toString();
    }
}
