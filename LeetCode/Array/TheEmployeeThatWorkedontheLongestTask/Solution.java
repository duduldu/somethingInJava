package Array.TheEmployeeThatWorkedontheLongestTask;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(1, hardestWorker(10,
                new int[][]{new int[]{0, 3}, new int[]{2, 5}, new int[]{0, 9}, new int[]{1, 15}}));
        Assert.assertEquals(3, hardestWorker(26,
                new int[][]{new int[]{1, 1}, new int[]{3, 7}, new int[]{2, 12}, new int[]{7, 17}}));
        Assert.assertEquals(0, hardestWorker(2,
                new int[][]{new int[]{0, 10}, new int[]{1, 20}}));

    }

    public static int hardestWorker(int n, int[][] logs) {
        int res = n;
        int cnt = 0;
        int leaveTime = 0;
        for (int[] log : logs) {
            int ct = log[1] - leaveTime;
            if (cnt == ct) res = Math.min(res, log[0]);
            if (ct > cnt) {
                cnt = ct;
                res = log[0];
            }
            leaveTime = log[1];
        }
        return res;
    }
}
