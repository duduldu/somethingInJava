package Dynamic_Programming.HouseRobberII;

import org.junit.Assert;

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
        int[] nums1 = new int[len - 1];
        int[] nums2 = new int[len - 1];
        System.arraycopy(nums, 0, nums1, 0, len - 1);
        System.arraycopy(nums, 1, nums2, 0, len - 1);
        return Math.max(rob1(nums1), rob1(nums2));
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
