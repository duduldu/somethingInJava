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
        int a=0,b=1,c=1;
        for(int i=3;i<=n;i++){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return c;
    }
}
