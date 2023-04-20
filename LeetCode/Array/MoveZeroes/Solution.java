package Array.MoveZeroes;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Assert.assertArrayEquals(new int[]{1,3,12,0,0}, moveZeroes(new int[]{0,1,0,3,12}));
        Assert.assertArrayEquals(new int[]{0}, moveZeroes(new int[]{0}));
    }

    public static int[] moveZeroes(int[] nums) {
        int count = 0;
        for(int num:nums){
            if(num==0) count++;
        }
        if(count==0) return nums;
        int left = 0;
        int right = 0;
        while(right<nums.length){
            if(nums[left]==0&&nums[right]!=0) {
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
        return nums;
    }
}
