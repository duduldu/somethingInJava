package Dynamic_Programming.JumpGameII;

import org.junit.Assert;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(2, jump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertEquals(2, jump(new int[]{2, 3, 0, 1, 4}));
    }

    public static int jump(int[] nums) {
        int len = nums.length;
        int[] tot =new int[len];
        Arrays.fill(tot,Integer.MAX_VALUE);
        tot[0]=0;
        for(int i =0;i<len;i++){
            int canJump = nums[i];
            for(int j=i+1;j<len&&canJump>0;j++){
                tot[j]=Math.min(tot[i]+1,tot[j]);
                canJump--;
            }
        }
        return tot[len-1];
    }
}
