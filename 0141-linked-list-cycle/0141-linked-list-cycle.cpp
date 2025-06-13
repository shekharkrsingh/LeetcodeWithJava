/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* first=head;
        ListNode* second=head;
        while(true){
            if(first==NULL || second==NULL || first->next==NULL)
            return false;
            first=first->next->next;
            second=second->next;
            if(first==second)
            return true;
        }
    }
};