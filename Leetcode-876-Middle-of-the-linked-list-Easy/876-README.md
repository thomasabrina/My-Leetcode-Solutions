# Problem: Middle of the Linked List

## Description

Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

### Examples

- **Example 1:**
  - **Input:** head = [1,2,3,4,5]
  - **Output:** [3,4,5]
  - **Explanation:** The middle node of the list is node 3.
  
  ![Middle of the Linked List Example 1](lc-midlist1.jpg "Middle Example 1")

- **Example 2:**
  - **Input:** head = [1,2,3,4,5,6]
  - **Output:** [4,5,6]
  - **Explanation:** Since the list has two middle nodes with values 3 and 4, we return the second one.
  
  ![Middle of the Linked List Example 2](lc-midlist2.jpg "Middle Example 2")

### Constraints

- The number of nodes in the list is in the range `[1, 100]`.
- `1 <= Node.val <= 100`

## Solution Insights

The task of finding the middle of the linked list can be efficiently solved using a two-pointer approach, often referred to as the "Tortoise and the Hare" algorithm. Here's a breakdown of the key insights from the solution:

- **Two-Pointer Technique:** Two pointers, `slow` and `fast`, are initialized at the head of the list. The `slow` pointer moves one step at a time, while the `fast` pointer moves two steps at a time.

- **Traversal:** As both pointers advance through the list, the `fast` pointer will reach the end of the list twice as fast as the `slow` pointer. When the `fast` pointer reaches the end of the list or becomes `null`, the `slow` pointer will be at the middle of the list.

- **Handling Even Number of Nodes:** In cases where the list contains an even number of nodes, and thus two middle nodes, the `slow` pointer will naturally stop at the second middle node due to the way the `fast` pointer advances (checking `fast` and `fast.next` for `null`).

- **Return Value:** The node at which the `slow` pointer stops is returned as the middle node of the list.

This approach ensures that the middle node(s) of the list can be found with a single pass through the list, meeting the problem's requirements and constraints efficiently.