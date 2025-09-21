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
        ListNode dummy(0);
	    dummy.next = head;
        ListNode* slowNode = &dummy;
        ListNode* fastNode = &dummy;

        for (int i = 0; i <= n; i++) {
            fastNode = fastNode->next;
        }

        while ( fastNode != nullptr ) {
            slowNode = slowNode->next;
            fastNode = fastNode->next;
        }

        ListNode* temp = slowNode->next->next;
        slowNode->next = temp;

        return dummy.next;
    }
};
