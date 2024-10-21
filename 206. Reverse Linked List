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
    public ListNode reverseList(ListNode head) {
        if (!isEmpty(head)) {
            ListNode currentNode = head;
            ListNode tempNode = null;
            ListNode prevNode = null;
            if (currentNode.next == null) {
                return head;
            }
            while(currentNode != null) {
                tempNode = currentNode.next;
                currentNode.next = prevNode;
                prevNode = currentNode;
                currentNode = tempNode;
            }
            head = prevNode;
        }
        return head;
    }

    public boolean isEmpty(ListNode head)
    {
      if ( head == null ) {
    	  return true;
      }
      else {
    	  return false;
      }
    }
}
