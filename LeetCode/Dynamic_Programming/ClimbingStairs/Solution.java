package Dynamic_Programming.ClimbingStairs;

import org.junit.Assert;

public class Solution {

    public static void main(String[] args) {
        Assert.assertEquals(1,climbStairs(1));
        Assert.assertEquals(2,climbStairs(2));
        Assert.assertEquals(3,climbStairs(3));
        Assert.assertEquals(14930352,climbStairs(35));
    }

    public static int climbStairs(int n){
        if(n<=2) return n;
        int a=1,b=2;
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
