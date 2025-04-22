package org.intro.leetcode;

public class LongestPalindromeString {

    public String longestString(String str) {
        int maxLength = 0;
        int N = str.length();
        int start = 0;
        for (int i = 0; i < N; i++) {

            for (int j = 0; j <= 1; j++) {
                int low = i;
                int high = i + j;

                while (low >= 0 && high < N && str.charAt(low) == str.charAt(high)) {
                    int currentLength = high - low + 1;
                    if (currentLength > maxLength) {
                        start = low;
                        maxLength = currentLength;
                    }
                    low--;
                    high++;
                }
            }
        }

        return str.substring(start, start + maxLength);
    }
}
