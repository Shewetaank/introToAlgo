package org.intro.leetcode.twopointertechnique;

import org.junit.Test;

public class SubSequenceTest {

    @Test
    public void test() {
        SubSequence sequence = new SubSequence();

        boolean result = sequence.isSubsequence("abc", "ahbgdc");
        System.out.println(result);

        // result = sequence.isSubsequence("axc", "ahbgdc");
        // System.out.println(result);

        result = sequence.isSubsequence("abbc", "ahbdc");
        System.out.println(result);
    }
}
