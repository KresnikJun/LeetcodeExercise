package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length -1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] +nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] anotherTwoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        temp.put(nums[0], 0);
        for(int i = 1; i < len; i++){
            if(temp.containsKey(target - nums[i])){
                return new int[]{temp.get(target - nums[i]), i};
            }
            temp.put(nums[i], i);
        }
        return new int[0];
    }
}
