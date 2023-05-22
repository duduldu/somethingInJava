package Array.ContainerWithMostWater;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(49, maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.assertEquals(1, maxArea(new int[]{1, 1}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }
}
