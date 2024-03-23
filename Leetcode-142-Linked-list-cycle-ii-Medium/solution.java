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
    public ListNode detectCycle(ListNode head) {
        // Initialize two pointers, slow and fast, at the head of the list
        ListNode slow = head, fast = head;
        // Flag to indicate if a cycle has been detected
        boolean hasCycle = false; 

        // Traverse the list with two pointers moving at different speeds
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
            // If slow and fast pointers meet, a cycle exists
            if (slow == fast) {
                hasCycle = true; 
                break; // Exit the loop as cycle is detected
            }
        }

        // If no cycle is detected, return null
        if (!hasCycle) { 
            return null;
        }

        // Reset slow pointer to the head for the second pass
        slow = head; 
        // Move both pointers at the same speed until they meet again
        while (slow != fast) { 
            slow = slow.next; // Move slow pointer one step
            fast = fast.next; // Move fast pointer one step
        }

        // The node where both pointers meet is the start of the cycle
        return slow; 
    }
}