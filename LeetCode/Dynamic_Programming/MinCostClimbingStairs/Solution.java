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
        int a = 0,b=0;
        for (int i = 2; i <= len; i++) {
            int c =  Math.min(a + cost[i - 2], b + cost[i - 1]);
            a=b;
            b=c;
        }
        return b;
    }
}
