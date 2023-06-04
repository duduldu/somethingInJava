package Array.NumberofDistinctAverages;

import org.junit.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(2, distinctAverages(new int[]{4,1,4,0,3,5}));
        Assert.assertEquals(1, distinctAverages(new int[]{1, 100}));
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        Set<Integer> set = new HashSet<>();
        while (left < right) {
            set.add(nums[left++] + nums[right--]);
        }
        return set.size();
    }
}
