/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val; // Value of the node
 *     ListNode next; // Reference to the next node in the list
 *     ListNode() {} // Default constructor
 *     ListNode(int val) { this.val = val; } // Constructor with node value
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; } // Constructor with node value and next node
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify edge cases, like removing the head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // Find the node just before the one to be removed
        ListNode x = findFromEnd(dummy, n + 1);
        // Skip the node to be removed
        x.next = x.next.next;
        // Return the new head, which might be the original head or the second node
        return dummy.next;
    }

    private ListNode findFromEnd(ListNode head, int k) {
        // Pointer to move k steps ahead
        ListNode p1 = head;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        // Second pointer starts at the head
        ListNode p2 = head;
        // Move both pointers until p1 reaches the end
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        // p2 is now at the (k-th node from the end) position
        return p2;
    }
}