package Dynamic_Programming.MaximumSubarray;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(6, maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(1, maxSubArray(new int[]{1}));
        Assert.assertEquals(23, maxSubArray(new int[]{5,4,-1,7,8}));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp = nums[0];
        int tot[] = new int[nums.length];
        for(int num:nums){
            if(temp<=0){
                if(num>=0){
                    temp=num;
                    max=num;
                }
                else {
                    max=Math.max(temp,num);
                    tot[0]=max;
                }
            }
            else {

            }
        }
       return max;
    }
}
