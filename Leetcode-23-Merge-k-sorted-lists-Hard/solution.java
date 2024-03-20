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
    public ListNode mergeKLists(ListNode[] lists) {
        // Check if the input array of lists is empty
        if (lists.length == 0) {
            return null; // Return null if there are no lists to merge
        }

        // Create a dummy node to act as the starting point of the merged list
        ListNode dummy = new ListNode(-1);
        // Use a pointer 'p' to help in building the merged list, starting from the dummy node
        ListNode p = dummy;

        // Initialize a priority queue to hold the list nodes. The priority queue is ordered by node values.
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            lists.length, (a, b)->(a.val - b.val)
        );

        // Add the first node of each list to the priority queue, if the list is not empty
        for (ListNode head : lists) {
            if (head != null) {
                pq.add(head);
            }
        }

        // Continue this process until the priority queue is empty
        while (!pq.isEmpty()) {
            // Poll the smallest node from the priority queue
            ListNode node = pq.poll();
            // Append this node to the merged list
            p.next = node;
            // If the polled node has a next node, add that next node to the priority queue
            if (node.next != null) {
                pq.add(node.next);
            }
            // Move the pointer 'p' forward
            p = p.next;
        }

        // Return the head of the merged list, which is the next node of the dummy node
        return dummy.next;
    }
}