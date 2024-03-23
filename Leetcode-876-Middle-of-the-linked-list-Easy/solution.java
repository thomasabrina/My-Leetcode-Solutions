/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val; // The value of the node
 *     ListNode next; // Reference to the next node in the list
 *     ListNode() {} // Default constructor
 *     ListNode(int val) { this.val = val; } // Constructor with node value
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; } // Constructor with node value and next node reference
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // Initialize two pointers, slow and fast, both starting at the head of the list
        ListNode slow = head, fast = head;
        // Loop until fast reaches the end of the list
        while (fast != null && fast.next != null) {
            // Move slow pointer one step
            slow = slow.next;
            // Move fast pointer two steps
            fast = fast.next.next;
        }
        // When fast pointer reaches the end, slow pointer will be at the middle of the list
        return slow;
    }
}