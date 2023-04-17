package Array.KidsWiththeGreatestNumberofCandies;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(Arrays.asList(true, true, true, false, true),
                kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        Assert.assertEquals(Arrays.asList(true, false, false, false, false),
                kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        Assert.assertEquals(Arrays.asList(true, false, true),
                kidsWithCandies(new int[]{12, 1, 12}, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int num : candies) {
            max = Math.max(num, max);
        }
        List<Boolean> res = new ArrayList<>();
        for (int num : candies) {
            if (num + extraCandies >= max) res.add(true);
            else res.add(false);
        }
        return res;
    }
}
