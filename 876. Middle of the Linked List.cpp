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
    ListNode* middleNode(ListNode* head) {
        int counter = 0;

        // if its just the head node
        if (!head->next) {
            return head;
        }

        counter++;

        ListNode* currentNode = head->next;

        counter++;

        while(currentNode->next) {
            counter++;
            currentNode = currentNode->next;
        }

        currentNode = head;

        if (remainder(counter, 2) == 0) {
            for (int i = 0; i < counter/2; i++) {
                currentNode = currentNode->next;
            }
            return currentNode;
        }
        else {
            for (int i = 0; i < counter/2 - 0.5; i++) {
                currentNode = currentNode->next;
            }
            return currentNode;
        }

    }
};
