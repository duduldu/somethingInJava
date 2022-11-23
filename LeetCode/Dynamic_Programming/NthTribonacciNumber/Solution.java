package Dynamic_Programming.NthTribonacciNumber;

import org.junit.Assert;

public class Solution {

    public static void main(String[] args) {
        Assert.assertEquals(0,tribonacci(0));
        Assert.assertEquals(1,tribonacci(1));
        Assert.assertEquals(1,tribonacci(2));
        Assert.assertEquals(4,tribonacci(4));
        Assert.assertEquals(1389537,tribonacci(25));
    }

    public static int tribonacci(int n) {
        if(n<2) return n;
        if(n==2) return 1;
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 1;
        for(int i=3;i<n+1;i++){
            res[i]=res[i-3]+res[i-2]+res[i-1];
        }
        return res[n];
    }
}
