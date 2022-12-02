package Dynamic_Programming.DeleteandEarn;

import org.junit.Assert;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(6, deleteAndEarn(new int[]{3,4,2}));
        Assert.assertEquals(9, deleteAndEarn(new int[]{2,2,3,3,3,4}));
    }

    public static int deleteAndEarn(int[] nums){
        Arrays.sort(nums);
        return 0;
    }
}
