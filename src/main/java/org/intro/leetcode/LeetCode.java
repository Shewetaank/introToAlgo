package org.intro.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> items = new HashSet<>();

        String test = "call";
        test.hashCode();

        while (head != null) {
            if (items.contains(head.next)) {
                return head.next;
            } else {
                items.add(head.next);
                head = head.next;
            }
        }
        return null;
    }
}
