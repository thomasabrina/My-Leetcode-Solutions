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
    // Recursive method to reverse a singly-linked list
    public ListNode reverse(ListNode pre, ListNode cur) {
        // Base case: If cur is null, return pre, which is the new head of the reversed list
        if (cur == null) {
            return pre;
        }
        
        // Store the next node of cur in temp
        ListNode temp = cur.next;
        
        // Reverse the direction of cur's pointer to pre
        cur.next = pre;
        
        // Recursively call reverse with cur as pre and temp as cur
        return reverse(cur, temp);
    }
    
    // Method to initiate the recursive reversal of the singly-linked list
    public ListNode reverseList(ListNode head) {
        // Call the recursive reverse method with pre as null (initially) and head as cur
        return reverse(null, head);
    }
}
