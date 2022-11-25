package Dynamic_Programming.MinCostClimbingStairs;

import org.junit.Assert;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Assert.assertEquals(15, minCostClimbingStairs(new int[]{10, 15, 20}));
        Assert.assertEquals(6, minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] res = new int[len + 1];
        Arrays.fill(res, 0x3f);
        res[0] = 0;
        res[1] = 0;
        for (int i = 2; i <= len; i++) {
            res[i] = Math.min(res[i - 2] + cost[i - 2], res[i - 1] + cost[i - 1]);
        }
        return Math.min(res[len - 1] + cost[len - 1], res[len - 2] + cost[len - 2]);
    }
}
