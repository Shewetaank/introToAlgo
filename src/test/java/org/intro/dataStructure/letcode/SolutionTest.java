package org.intro.dataStructure.letcode;

import org.intro.leetcode.ListNode;
import org.intro.leetcode.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        /*
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
         */

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(3);

        Solution sln = new Solution();
        ListNode res = sln.addTwoNumbers(l1, l2);

        String test = "";
        while (res != null) {
            test = res.val + test;
            res = res.next;
        }

        System.out.println(test);
    }

    @Test
    public void test1() {
        Solution sln = new Solution();

        System.out.println(sln.reverse(120));
    }
}
