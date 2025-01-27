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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start=null;
        ListNode firstIndex;
        ListNode pre=null;
        ListNode curr = head;
        ListNode post=null;
        int count = 1;
        while (count < left) {
            start = curr;
            curr=curr.next;
            count++;
        }
        firstIndex=curr;
        while (count <= right) {
            post = curr.next;
            curr.next = pre;
            pre = curr;
            curr = post;
            count++;
        }
        if(start!=null)
        start.next=pre;
        else
        head=pre;
        firstIndex.next=curr;
        return head;
    }
}