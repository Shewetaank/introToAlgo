package org.intro.leetcode.twopointertechnique;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
