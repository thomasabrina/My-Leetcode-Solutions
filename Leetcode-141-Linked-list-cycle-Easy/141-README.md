# Problem: Linked List Cycle

## Description

Given the head of a linked list, determine if the linked list has a cycle in it. A cycle exists in a linked list if a node can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that the tail's `next` pointer is connected to (0-indexed). Note that `pos` is not passed as a parameter.

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

### Examples

- **Example 1:**
  - **Input:** head = [3,2,0,-4], pos = 1
  - **Output:** true
  - **Explanation:** There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
  
  ![Circular Linked List Example 1](circularlinkedlist.png "Circular Linked List Example 1")

- **Example 2:**
  - **Input:** head = [1,2], pos = 0
  - **Output:** true
  - **Explanation:** There is a cycle in the linked list, where the tail connects to the 0th node.
  
  ![Circular Linked List Example 2](circularlinkedlist_test2.png "Circular Linked List Example 2")

- **Example 3:**
  - **Input:** head = [1], pos = -1
  - **Output:** false
  - **Explanation:** There is no cycle in the linked list.
  
  ![Circular Linked List Example 3](circularlinkedlist_test3.png "Circular Linked List Example 3")

### Constraints

- The number of nodes in the list is in the range `[0, 10^4]`.
- `-10^5 <= Node.val <= 10^5`
- `pos` is `-1` or a valid index in the linked list.

## Solution Insights

The problem of detecting a cycle in a linked list can be addressed using Floyd's Tortoise and Hare algorithm, which is a two-pointer technique. Here's a breakdown of the key insights from the solution:

- **Two-Pointer Technique:** Two pointers, `slow` and `fast`, are initialized at the head of the list. The `slow` pointer moves one step at a time, while the `fast` pointer moves two steps at a time.

- **Cycle Detection:** As the pointers advance through the list, if there is a cycle, the `fast` pointer will eventually meet the `slow` pointer. This is because the `fast` pointer will loop around the cycle and catch up to the `slow` pointer.

- **Termination Condition:** The loop continues until the `fast` pointer reaches the end of the list (i.e., `fast` or `fast.next` is `null`). If the `fast` pointer reaches the end, it means there is no cycle in the list.

- **Return Value:** If the `slow` and `fast` pointers meet, the function returns `true`, indicating a cycle. If the `fast` pointer reaches the end of the list, the function returns `false`, indicating no cycle.

- **Memory Complexity:** The algorithm operates with `O(1)` memory, not using any additional data structures that depend on the size of the input list.

This approach ensures that the presence of a cycle is detected using only two pointers, thus achieving the follow-up challenge of solving the problem with constant memory.