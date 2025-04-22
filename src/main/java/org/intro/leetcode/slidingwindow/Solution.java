package org.intro.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;

        while (list1 != null && list2 != null) {
            int val;

            if (list1.val <= list2.val) {
                val = list1.val;
                list1 = list1.next;
            } else {
                val = list2.val;
                list2 = list2.next;
            }

            head = append(head, val);
        }

        while (list1 != null) {
            head = append(head, list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            head = append(head, list2.val);
            list2 = list2.next;
        }

        return head;
    }

    private ListNode append(ListNode head, int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            return node;
        }

        ListNode last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;

        return head;
    }


}
