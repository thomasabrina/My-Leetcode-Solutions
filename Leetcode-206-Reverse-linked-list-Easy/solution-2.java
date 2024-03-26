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
        // Initialize three pointers: pre, cur, and temp
        ListNode pre = null; // Points to the previous node
        ListNode cur = head; // Points to the current node
        ListNode temp = null; // Temporary pointer
        
        // Traverse the list and reverse the pointers
        while (cur != null) {
            temp = cur.next; // Store the next node of cur in temp
            cur.next = pre; // Reverse the direction of cur's pointer to pre
            pre = cur; // Move pre to cur
            cur = temp; // Move cur to the next node (temp)
        }
        
        // Return the new head of the reversed list (pre)
        return pre;
    }
}
