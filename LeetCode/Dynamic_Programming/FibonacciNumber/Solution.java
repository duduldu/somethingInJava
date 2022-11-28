package Dynamic_Programming.FibonacciNumber;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(0,fib(0));
        Assert.assertEquals(1,fib(1));
        Assert.assertEquals(1,fib(2));
        Assert.assertEquals(5,fib(5));
        Assert.assertEquals(9227465,fib(35));
    }

    public static int fib(int n){
        if(n<2) return n;
       int a=0,b=1;
       for(int i=2;i<n+1;i++){
           int c=a+b;
           a=b;
           b=c;
       }
       return b;
    }

}
