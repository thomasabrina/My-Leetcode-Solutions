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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Initialize two pointers for traversing the two lists
        ListNode p1 = headA, p2 = headB;
        // Continue traversing until both pointers meet or both become null
        while (p1 != p2) {
            // If p1 reaches the end of list A, switch it to the head of list B
            if (p1 == null) {
                p1 = headB;
            } else {
                // Move p1 to the next node in list A
                p1 = p1.next;
            }
            // If p2 reaches the end of list B, switch it to the head of list A
            if (p2 == null) {
                p2 = headA;
            } else {
                // Move p2 to the next node in list B
                p2 = p2.next;
            }
        }
        // Return the intersection node, or null if no intersection exists
        return p1;
    }
}