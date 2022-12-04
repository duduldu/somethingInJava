package Dynamic_Programming.DeleteandEarn;

import org.junit.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(6, deleteAndEarn(new int[]{3, 4, 2}));
        Assert.assertEquals(9, deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }

    public static int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = nums[0];
        for (int num : nums) {
            max= Math.max(max,num);
            map.put(num, map.getOrDefault(num, 0) + num);
        }
        int[] tot = new int[max+1];
        for(int key: map.keySet()){
            tot[key]=map.get(key);
        }
        return rob(tot);
    }

    public static int rob(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[0];
        int[] res = new int[len];
        int a = nums[0];
        int b = Math.max(a, nums[1]);
        for(int i=2;i<len;i++){
            int c = Math.max(b,a+nums[i]);
            a=b;
            b=c;
        }
        return b;
    }
}
