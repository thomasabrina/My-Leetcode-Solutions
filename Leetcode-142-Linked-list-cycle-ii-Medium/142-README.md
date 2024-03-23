# Problem: Linked List Cycle II

## Description

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null. A cycle in a linked list occurs when a node can be reached again by continuously following the `next` pointer. Internally, `pos` denotes the index of the node that the tail's `next` pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that `pos` is not passed as a parameter.

Do not modify the linked list.

### Examples

- **Example 1:**
  - **Input:** head = [3,2,0,-4], pos = 1
  - **Output:** tail connects to node index 1
  - **Explanation:** There is a cycle in the linked list, where the tail connects to the second node.

  ![Circular Linked List Example 1](circularlinkedlist.png "Circular Linked List Example 1")

- **Example 2:**
  - **Input:** head = [1,2], pos = 0
  - **Output:** tail connects to node index 0
  - **Explanation:** There is a cycle in the linked list, where the tail connects to the first node.

  ![Circular Linked List Example 2](circularlinkedlist_test2.png "Circular Linked List Example 2")

- **Example 3:**
  - **Input:** head = [1], pos = -1
  - **Output:** no cycle
  - **Explanation:** There is no cycle in the linked list.

  ![Circular Linked List Example 3](circularlinkedlist_test3.png "Circular Linked List Example 3")

### Constraints

- The number of nodes in the list is in the range [0, 10^4].
- -10^5 <= Node.val <= 10^5
- `pos` is -1 or a valid index in the linked list.

### Follow-up

Can you solve it using O(1) (i.e., constant) memory?

## Solution Insights

The challenge of finding the node where the cycle begins in a linked list can be solved using a two-pointer technique, similar to Floyd's Tortoise and Hare algorithm. Here's a breakdown of the key insights from the solution:

- **Two-Pointer Technique:** Initialize two pointers, `slow` and `fast`, at the head of the list. The `slow` pointer moves one step at a time, while the `fast` pointer moves two steps at a time.

- **Cycle Detection:** If there is a cycle, the `fast` pointer will eventually meet the `slow` pointer as it loops around the cycle.

- **Finding Cycle Start:** Once a cycle is detected, reset the `slow` pointer to the head and move both `slow` and `fast` one step at a time. The node where they meet again is the start of the cycle.

- **No Cycle Case:** If no cycle is detected (i.e., `fast` or `fast.next` is `null`), return `null`.

- **Memory Complexity:** The solution uses O(1) memory, as it does not require any additional data structures proportional to the input list size.

This method ensures that the node where the cycle begins is found efficiently, adhering to the memory constraint specified in the follow-up question.