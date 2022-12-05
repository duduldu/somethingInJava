package Dynamic_Programming.JumpGame;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Assert.assertTrue(canJump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertFalse(canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        for (int i = 0; i < len; i++) {
            max = Math.max(max, nums[i] + i);
            if (max >= len - 1) return true;
            if (max == i) return false;
        }
        return false;
    }
}
