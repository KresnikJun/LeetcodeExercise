package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || jewels.isEmpty()) {
            return 0;
        }
        if (stones == null || stones.isEmpty()) {
            return 0;
        }

        Set<Character> jewel = new HashSet<Character>();
        for(Character j : jewels.toCharArray()) {
            jewel.add(j);
        }

        int count = 0;
        for (Character s : stones.toCharArray()) {
            if (jewel.contains(s)) {
                count++;
            }
        }
        return count;
    }
}
