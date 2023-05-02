package Array.GroupAnagrams;

import org.junit.Assert;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals(3, groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).size());
        Assert.assertEquals("", groupAnagrams(new String[]{""}).get(0).get(0));
        Assert.assertEquals("a", groupAnagrams(new String[]{"a"}).get(0).get(0));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int idx = 0;
        for (String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            if (map.get(new String(cs)) == null) {
                List<String> list = new ArrayList<>();
                list.add(str);
                res.add(list);
                map.put(new String(cs), idx++);
            } else {
                int i = map.get(new String(cs));
                List<String> list = res.get(i);
                list.add(str);
            }
        }
        return res;
    }
}
