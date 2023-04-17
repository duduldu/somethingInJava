package Linked_List.ReverseLinkedList;

import Linked_List.ListNode;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;

class Solution {

    public static void main(String[] args) {
        Assert.assertEquals(ListNode.generateListNode(new int[]{1, 2, 3}), reverseList(ListNode.generateListNode(new int[]{3, 2, 1})));
        Assert.assertEquals(ListNode.generateListNode(new int[]{1, 2, 3, 4, 5}), reverseList(ListNode.generateListNode(new int[]{5, 4, 3, 2, 1})));
        Assert.assertEquals(ListNode.generateListNode(new int[]{}), reverseList(ListNode.generateListNode(new int[]{})));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}