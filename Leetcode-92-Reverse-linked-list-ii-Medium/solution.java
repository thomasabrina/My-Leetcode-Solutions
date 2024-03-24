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
    // Global variable to track the successor node
    ListNode successor = null;
    
    // Helper method to reverse the first n nodes of a linked list
    ListNode reverseN(ListNode head, int n) {
        // Base case: if n is 1, we've reached the target node to reverse
        if (n == 1) {
            // Set the successor to the next node of the current head
            successor = head.next;
            return head; // Return the current head
        }
        // Recursively reverse the sublist starting from the next node
        ListNode last = reverseN(head.next, n - 1);
        // Reverse the pointers of the current node and its next node
        head.next.next = head;
        // Set the next node of the current head to the successor node
        head.next = successor;
        return last; // Return the last node of the reversed sublist
    }
    
    // Method to reverse a sublist between positions left and right
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // If left is 1, call reverseN to reverse the first right nodes
        if (left == 1) {
            return reverseN(head, right);
        }
        // Recursively call reverseBetween on the next node and adjust left and right positions
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head; // Return the head of the reversed sublist
    }
}
