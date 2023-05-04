package Greedy.Dota2Senate;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Assert.assertEquals("Radiant", predictPartyVictory("RD"));
        Assert.assertEquals("Dire", predictPartyVictory("RDD"));
        Assert.assertEquals("Dire", predictPartyVictory("DDRRR"));
        Assert.assertEquals("Radiant", predictPartyVictory("DRRDRDRDRDDRDRDR"));
    }

    public static String predictPartyVictory(String senate) {
        char[] cs = senate.toCharArray();
        while (help(cs) == 'X') {
            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == 'D') {
                    boolean flag = false;
                    for (int j = i + 1; j < cs.length; j++) {
                        if (cs[j] == 'R') {
                            cs[j] = 'X';
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        for (int j = 0; j < i; j++) {
                            if (cs[j] == 'R') {
                                cs[j] = 'X';
                                break;
                            }
                        }
                    }
                }
                if (cs[i] == 'R') {
                    boolean flag = false;
                    for (int j = i + 1; j < cs.length; j++) {
                        if (cs[j] == 'D') {
                            cs[j] = 'X';
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        for (int j = 0; j < i; j++) {
                            if (cs[j] == 'D') {
                                cs[j] = 'X';
                                break;
                            }
                        }
                    }
                }
            }
        }
        return help(cs) == 'D' ? "Dire" : "Radiant";
    }

    public static char help(char[] cs) {
        int rc = 0, dc = 0;
        for (char c : cs) {
            if (c == 'D') dc++;
            if (c == 'R') rc++;
        }
        if (rc * dc > 0) return 'X';
        else return rc > 0 ? 'R' : 'D';
    }
}
