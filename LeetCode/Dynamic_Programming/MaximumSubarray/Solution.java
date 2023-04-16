package Dynamic_Programming.MaximumSubarray;

import org.junit.Assert;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(6, maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assert.assertEquals(1, maxSubArray(new int[]{1}));
        Assert.assertEquals(23, maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int temp = max;
        for (int i = 1; i < nums.length; i++) {
            temp = Math.max(nums[i],nums[i]+temp);
            max = Math.max(temp,max);
        }
        return max;
    }
}
