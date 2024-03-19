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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify edge cases and use it to build the result list
        ListNode dummy = new ListNode(-1), p = dummy;
        // Pointers for traversing the two lists
        ListNode p1 = list1, p2 = list2;

        // Traverse both lists until one is exhausted
        while (p1 != null && p2 != null) {
            // Compare the current nodes of both lists
            if (p1.val > p2.val) {
                // Attach the smaller node to the merged list
                p.next = p2;
                // Move the pointer forward in list2
                p2 = p2.next;
            } else {
                // Attach the smaller (or equal) node to the merged list
                p.next = p1;
                // Move the pointer forward in list1
                p1 = p1.next;
            }
            // Move the pointer forward in the merged list
            p = p.next;
        }

        // Attach the remaining elements of list1 or list2, if any
        if (p1 != null) {
            p.next = p1;
        } else if (p2 != null) {
            p.next = p2;
        }

        // Return the merged list, skipping the dummy node
        return dummy.next;
    }
}