package easy;

/**
 * https://leetcode-cn.com/problems/binary-search/
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int pivot = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if(nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] < target) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return  pivot;
    }
}
