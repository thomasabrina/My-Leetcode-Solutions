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
    // Method to reverse a singly-linked list
    public ListNode reverseList(ListNode head) {
        // If the list is empty or has only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }
        
        // Recursively reverse the sublist starting from the second node
        ListNode last = reverseList(head.next);
        
        // Connect the reversed sublist to the current node
        head.next.next = head; // Reverse the pointer direction
        head.next = null;      // Break the original connection
        
        // Return the new head of the reversed list
        return last;
    }
}
