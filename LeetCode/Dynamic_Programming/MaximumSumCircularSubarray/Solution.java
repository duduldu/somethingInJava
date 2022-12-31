package Dynamic_Programming.MaximumSumCircularSubarray;

import org.junit.Assert;

public class Solution {

    public static void main(String[] args) {
        Assert.assertEquals(6, maxSubarraySumCircular(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(1, maxSubarraySumCircular(new int[]{1}));
        Assert.assertEquals(23, maxSubarraySumCircular(new int[]{5,4,-1,7,8}));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        return 0;
    }
}
