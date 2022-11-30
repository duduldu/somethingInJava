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
        res[0] = nums[0];
        res[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<len;i++){
            res[i]=Math.max(res[i-1],res[i-2]+nums[i]);
        }
        return res[len-1];
    }
}
