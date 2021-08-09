package easy;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/submissions/
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
