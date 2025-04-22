package org.intro.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = l1;
        int temp = 0;
        while (l1 != null || l2 != null) {
            l1 = l1 == null ? new ListNode(0) : l1;
            l2 = l2 == null ? new ListNode(0) : l2;

            temp = l1.val + l2.val + temp;
            if (temp > 9) {
                l1.val = temp % 10;
                temp = 1;
            } else {
                l1.val = temp;
                temp = 0;
            }

            if (l1.next == null && (l2.next != null || temp == 1)) {
                l1.next = new ListNode(0);
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        return res;
    }

    public int reverse(int x) {
        List<Integer> values = new ArrayList<>();
        int multiplier = x < 0 ? -1 : 1;
        int temp = x * multiplier;

        while (temp > 0) {
            values.add(temp % 10);
            temp = temp / 10;
        }

        if (values.size() > 10) {
            return 0;
        } else if (values.size() == 10) {
            x = 0;
            temp = values.size() - 1;
            int i = 0;
            while (i < values.size() - 1) {
                x = x + ( (int) Math.pow(10, temp) * values.get(i));
                i++;
                temp--;
            }
            if (values.get(i + 1) > 7) {
                return 0;
            }
            return x * multiplier;
        } else {
            x = 0;
            temp = values.size() - 1;
            int i = 0;
            while (i < values.size()) {
                x = x + ( (int) Math.pow(10, temp) * values.get(i));
                i++;
                temp--;
            }
            return x * multiplier;
        }
    }
}