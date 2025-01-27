/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        count -= n;
        // if (count < 0)
        //     return head;
        if (count == 0)
            return head.next;
        node = head;
        while (count > 1) {
            count--;
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
}