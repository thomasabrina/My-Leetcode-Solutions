/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val; // The value contained in the node
 *     ListNode next; // Reference to the next node in the list
 *     ListNode(int x) {
 *         val = x; // Initialize the node's value with x
 *         next = null; // Initialize the next pointer to null
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Initialize two pointers, slow and fast, at the head of the list
        ListNode slow = head, fast = head;
        // Iterate as long as fast and the node after fast are not null
        while (fast != null && fast.next != null) {
            // Move slow pointer one step forward
            slow = slow.next;
            // Move fast pointer two steps forward
            fast = fast.next.next;
            // If slow and fast pointers meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }
        // If we reach here, no cycle was found
        return false;
    }
}