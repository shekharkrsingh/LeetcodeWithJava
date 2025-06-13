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
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* node = head;
        ListNode* result = new ListNode();
        ListNode* pre = result;
        while (node != NULL) {
            ListNode* tempNode = node->next;
            bool flag = false;
            while (tempNode != NULL && tempNode->val == node->val) {
                tempNode = tempNode->next;
                flag = true;
            }
            if (!flag) {
                pre->next = node;
                pre = pre->next;
            }
            node = tempNode;
        }
        pre->next=NULL;
        return result->next;
    }
};