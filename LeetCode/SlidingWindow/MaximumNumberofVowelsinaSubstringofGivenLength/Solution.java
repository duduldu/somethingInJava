package SlidingWindow.MaximumNumberofVowelsinaSubstringofGivenLength;

import org.junit.Assert;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(3, maxVowels("abciiidef", 3));
        Assert.assertEquals(2, maxVowels("aeiou", 2));
        Assert.assertEquals(2, maxVowels("leetcode", 3));
        Assert.assertEquals(0, maxVowels("rhythms", 4));
        Assert.assertEquals(1, maxVowels("tryhard", 4));
        Assert.assertEquals(2, maxVowels("zpuerktejfp", 3));
    }

    public static int maxVowels(String s, int k) {
        String vowel = "aeiou";
        Queue<Character> queue = new LinkedList<>();
        char[] cs = s.toCharArray();
        int len = cs.length;
        int tmp = 0;
        int res = 0;
        for (int i = 0; i < k; i++) {
            if (vowel.indexOf(cs[i]) != -1) tmp++;
            queue.offer(cs[i]);
        }
        res = tmp;
        for (int i = k; i < len; i++) {
            if (tmp == k) return k;
            char first = queue.poll();
            int fi = vowel.indexOf(first);
            int li = vowel.indexOf(cs[i]);
            if (fi == -1 && li > -1){
                tmp++;
                res = Math.max(tmp,res);
            }
            if (fi > -1 && li == -1) tmp--;
            queue.offer(cs[i]);
        }
        return res;
    }
}
