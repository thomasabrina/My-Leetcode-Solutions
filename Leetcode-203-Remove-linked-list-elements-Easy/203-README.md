# Problem: Remove Linked List Elements

## Description

Given the head of a linked list and an integer `val`, remove all nodes from the linked list that have `Node.val` equal to `val`, and return the new head.

### Examples

- **Example 1:**
  - **Input:** `head = [1,2,6,3,4,5,6]`, `val = 6`
  - **Output:** `[1,2,3,4,5]`

  ![Remove Linked List Elements Example 1](removelinked-list-ex1.jpeg)

- **Example 2:**
  - **Input:** `head = []`, `val = 1`
  - **Output:** `[]`

- **Example 3:**
  - **Input:** `head = [7,7,7,7]`, `val = 7`
  - **Output:** `[]`

### Constraints

- The number of nodes in the list is in the range `[0, 10^4]`.
- `1 <= Node.val <= 50`
- `0 <= val <= 50`

## Solution Insights

Removing elements with given value from a linked list can be done either by using the original linked list directly or setting up a dummy head node. Both approaches offer their own benefits and can be implemented effectively.

- **Using the original linked list directly:** In this method, the operation of removing the head node is different from removing other nodes because other nodes in the linked list are removed by updating the next pointer of the previous node to skip the current node, whereas the head node does not have a previous node. So, how do we remove the head node? In fact, it is sufficient to simply move the head pointer to the next node. This effectively removes a head node from the linked list. The code for this method is like:   
```java
public ListNode removeElements(ListNode head, int val) {
    // Iterate through the list to remove all consecutive head nodes with the value 'val'
    while (head != null && head.val == val) {
        head = head.next; // Move head pointer to the next node
    }
    // If the list becomes empty or all nodes are removed, return null or the current head
    if (head == null) {
        return head;
    }
    // Initialize two pointers: pre pointing to the current head and cur pointing to the next node
    ListNode pre = head;
    ListNode cur = head.next;
    // Iterate through the remaining list to remove nodes with the value 'val'
    while (cur != null) {
        // If the current node's value is equal to 'val', remove it by updating the previous node's next pointer
        if (cur.val == val) {
            pre.next = cur.next; // Remove current node by skipping it
        } else {
            pre = cur; // Update pre to current node since it's not removed
        }
        cur = cur.next; // Move to the next node
    }
    // Return the updated head of the list
    return head;
}
```   
You can also solve this problem without pre Node:   
```java
public ListNode removeElements(ListNode head, int val) {
    // Remove consecutive head nodes with the value 'val'
    while(head != null && head.val == val) {
        head = head.next; // Move head pointer to the next node
    }
    
    // Initialize a pointer 'curr' to traverse the list
    ListNode curr = head;
    
    // Traverse the list to remove nodes with the value 'val'
    while(curr != null) {
        // Remove consecutive nodes with the value 'val'
        while(curr.next != null && curr.next.val == val) {
            curr.next = curr.next.next; // Skip the current node by updating the next pointer
        }
        curr = curr.next; // Move to the next node
    }
    
    // Return the updated head of the list
    return head;
}
```   
The time and space complexities of these two code snippets are the same, both having a time complexity of O(n) and a space complexity of O(1).

- **Setting up a dummy head node:** The problem of removing elements from a linked list can be effectively solved by traversing the list while maintaining two pointers: one pointing to the current node and another pointing to the previous node. As the traversal progresses, if a node with the given value is encountered, the previous node's next pointer is updated to skip the current node, effectively removing it from the list. Special attention is needed for cases where the target value appears at the beginning of the list. This solution operates with O(1) memory complexity and linear time complexity, meeting the problem's requirements efficiently.
