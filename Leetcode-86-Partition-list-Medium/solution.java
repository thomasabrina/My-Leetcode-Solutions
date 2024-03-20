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
    public ListNode partition(ListNode head, int x) {
        // Create two dummy nodes to start two separate lists
        ListNode dummy1 = new ListNode(-1); // For elements less than x
        ListNode dummy2 = new ListNode(-1); // For elements greater than or equal to x
        // Pointers to the current end of the two lists
        ListNode p1 = dummy1, p2 = dummy2;
        // Pointer to iterate over the original list
        ListNode p = head;
        
        // Iterate through the original list
        while (p != null) {
            if (p.val >= x) {
                // If current node's value is greater than or equal to x, append it to the second list
                p2.next = p;
                p2 = p2.next;
            } else {
                // If current node's value is less than x, append it to the first list
                p1.next = p;
                p1 = p1.next;
            }
            // Move to the next node, saving the next node and breaking the link to detach current node
            ListNode temp = p.next;
            p.next = null; // Detach the current node to avoid cyclic references
            p = temp;
        }
        // Connect the two lists
        p1.next = dummy2.next;
        // Return the head of the new list, which starts after dummy1
        return dummy1.next;
    }
}