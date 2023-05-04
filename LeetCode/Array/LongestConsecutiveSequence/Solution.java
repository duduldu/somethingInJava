package Array.LongestConsecutiveSequence;

import org.junit.Assert;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(4, longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        Assert.assertEquals(9, longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        Assert.assertEquals(0, longestConsecutive(new int[]{}));
    }

    public static int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (len <= 1) return len;
        Arrays.sort(nums);
        int res = 0;
        int temp = nums[0] - 1;
        int cnt = 0;
        for (int num : nums) {
            if (num == temp + 1) {
                temp = num;
                cnt++;
            } else if (num != temp) {
                temp = num;
                res = Math.max(cnt, res);
                cnt = 1;
            }
        }
        res = Math.max(res, cnt);
        return res;
    }
}
