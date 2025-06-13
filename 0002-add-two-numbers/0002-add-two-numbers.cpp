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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* head=new ListNode();
        ListNode* node=head;
        int remainder=0;
        while(l1!=NULL || l2!=NULL || remainder!=0){
            int add=remainder;
            if(l1!=NULL){
                add+=l1->val;
                l1=l1->next;
            }
            if(l2!=NULL){
                add+=l2->val;
                l2=l2->next;
            }
            remainder=add/10;
            node->next=new ListNode(add%10);
            node=node->next;
        }
        return head->next;
    }
};