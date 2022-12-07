package Dynamic_Programming.HouseRobberII;

import org.junit.Assert;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Assert.assertEquals(3, rob(new int[]{2, 3, 2}));
        Assert.assertEquals(4, rob(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(3, rob(new int[]{1, 2, 3}));
        Assert.assertEquals(0, rob(new int[]{0}));
    }

    public static int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        return Math.max(rob1(Arrays.copyOfRange(nums,0,len-1)),
                rob1(Arrays.copyOfRange(nums,1,len)));
    }

    public static int rob1(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        int a = nums[0];
        int b = Math.max(a, nums[1]);
        for (int i = 2; i < len; i++) {
            int c = Math.max(b, a + nums[i]);
            a = b;
            b = c;
        }
        return b;
    }
}
