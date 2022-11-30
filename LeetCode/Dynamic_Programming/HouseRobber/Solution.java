package Dynamic_Programming.HouseRobber;

import org.junit.Assert;

public class Solution {

    public static void main(String[] args) {
        Assert.assertEquals(4, rob(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(12, rob(new int[]{2, 7, 9, 3, 1}));
        Assert.assertEquals(0, rob(new int[]{0}));
    }

    public static int rob(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[0];
        int[] res = new int[len];
        int a = nums[0];
        int b = Math.max(a, nums[1]);
        for(int i=2;i<len;i++){
            int c = Math.max(b,a+nums[i]);
            a=b;
            b=c;
        }
        return b;
    }
}
