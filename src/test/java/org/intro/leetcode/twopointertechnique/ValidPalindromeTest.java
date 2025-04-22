package org.intro.leetcode.twopointertechnique;

import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void test() {
        ValidPalindrome palindrome = new ValidPalindrome();

        String s = " apG0i4maAs::sA0m4i0Gp0";
        System.out.println(palindrome.isPalindrome(s));
    }
}
