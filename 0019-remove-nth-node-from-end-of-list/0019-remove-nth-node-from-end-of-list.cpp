/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        head=reverse(head);
        ListNode* node=head;
        ListNode* pre=head;
        if(n==1)
        return reverse(head->next);
        while(n!=1){
            pre=node;
            node=node->next;
            n--;
        }
        pre->next=node->next;
        return reverse(head);
    }

    ListNode* reverse(ListNode* head){
        ListNode* node=head;
        ListNode* pre=NULL;
        while(node!=NULL){
            ListNode* temp=node->next;
            node->next=pre;
            pre=node;
            node=temp;
        }
        return pre;
    }
};