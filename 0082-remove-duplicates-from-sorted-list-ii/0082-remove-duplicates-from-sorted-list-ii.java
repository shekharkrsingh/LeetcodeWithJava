/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead=new ListNode();
        ListNode node=newHead;
        node.next=head;
        node=node.next;
        ListNode preNode=newHead;
        while(node!=null){
            int count=0;
            int val=node.val;
            ListNode tempNode=node;
            while(tempNode!=null && tempNode.val==val){
                count++;
                tempNode=tempNode.next;
            }
            if(count>1){
                preNode.next=tempNode;
                node=tempNode;
            }else{
                preNode=node;
                node=node.next;
            }
        }
        return newHead.next;
    }
}