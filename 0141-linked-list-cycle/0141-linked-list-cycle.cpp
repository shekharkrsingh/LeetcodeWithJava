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
        if(head==NULL)
        return false;
        ListNode* first=head;
        ListNode* second=head;
        while(true){
            if(first->next==NULL || first->next->next==NULL)
            return false;
            first=first->next->next;
            second=second->next;
            if(first==second)
            return true;
        }
        return true;
    }
};