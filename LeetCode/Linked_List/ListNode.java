package Linked_List;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode generateListNode(int[] nums) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        for (int num : nums) {
            head.next = new ListNode(num);
            head = head.next;
        }
        return dummy.next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        ListNode node = (ListNode) obj;
        ListNode that = this;
        while (node != null && that != null) {
            if (that.val != node.val) return false;
            that = that.next;
            node = node.next;
        }
        return node == null && that == null;
    }
}
