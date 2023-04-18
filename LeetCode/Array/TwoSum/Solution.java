package Array.TwoSum;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Assert.assertArrayEquals(new int[]{0, 1}, twoSum(new int[]{2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[]{1, 2}, twoSum(new int[]{3, 2, 4}, 6));
        Assert.assertArrayEquals(new int[]{0, 1}, twoSum(new int[]{3, 3}, 6));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.get(t) != null) {
                return new int[]{map.get(t), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
