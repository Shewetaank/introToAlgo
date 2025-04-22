package org.intro.leetcode.twopointertechnique;

public class SubSequence {

    public boolean isSubsequence(String s, String t) {
        int j = 0;
        char [] sSplit = s.toCharArray();
        char [] tSplit = t.toCharArray();

        for (int i = 0 ; i < tSplit.length; i++) {
            if (j < sSplit.length && sSplit[j] == (tSplit[i])) {
                j++;
            }
        }

        return j == sSplit.length;
    }
}
