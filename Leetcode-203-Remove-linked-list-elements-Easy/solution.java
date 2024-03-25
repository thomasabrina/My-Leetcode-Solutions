
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
    public ListNode removeElements(ListNode head, int val) {
        // If the head is null, return null
        if (head == null) {
            return head;
        }
        
        // Create a dummy node to simplify the removal process
        ListNode dummy = new ListNode(-1);
        dummy.next = head; // Connect the dummy node to the original head
        
        ListNode cur = head; // Pointer to traverse the list
        ListNode pre = dummy; // Pointer to track the previous node
        
        // Traverse the list
        while (cur != null) {
            // If the current node's value matches the target value
            if (cur.val == val) {
                // Skip the current node by connecting the previous node directly to the next node
                pre.next = cur.next;
            } else {
                // Move the previous pointer forward
                pre = cur;
            }
            // Move the current pointer forward
            cur = cur.next;
        }
        
        // Return the next node of the dummy node, which is the head of the modified list
        return dummy.next;
    }
}
