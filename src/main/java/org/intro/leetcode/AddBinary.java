package org.intro.leetcode;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class AddBinary {

    public String addBinary(String a, String b) {
        if (StringUtils.isEmpty(a)) {
            return b;
        }
        if (StringUtils.isEmpty(b)) {
            return a;
        }

        int j = Math.min(a.length() - 1, b.length() - 1);

        char[] result = new char[Math.max(a.length(), b.length())];
        int k = result.length - 1;
        char carry = '0';
        while (j >= 0) {
            if (a.charAt(j) == '1' && b.charAt(j) == '1') {
                if (carry == '0') {
                    result[k] = 0;
                    carry = '1';
                } else {
                    result[k] = 1;
                }
            } else if ((a.charAt(j) == '1' && b.charAt(j) == '0') || (a.charAt(j) == '0' && b.charAt(j) == '1')) {
                if (carry == '1') {
                    result[k] = 0;
                } else {
                    result[k] = 1;
                }
            } else if (a.charAt(j) == '0' && b.charAt(j) == '0') {
                if (carry == '1') {
                    result[k] = 1;
                    carry = '0';
                } else {
                    result[k] = 0;
                }
            }
            k--;
            j--;
        }

        return "";
    }
}
