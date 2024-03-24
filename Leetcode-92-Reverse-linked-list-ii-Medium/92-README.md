# Problem: Reverse Linked List II

## Description

Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

### Examples

- **Example 1:**
  - **Input:** head = [1,2,3,4,5], left = 2, right = 4
  - **Output:** [1,4,3,2,5]

  ![Reverse Linked List Example 1](reverse_linked_list_ex_1.jpeg)

- **Example 2:**
  - **Input:** head = [5], left = 1, right = 1
  - **Output:** [5]

### Constraints

- The number of nodes in the list is n.
- 1 <= n <= 500
- -500 <= Node.val <= 500
- 1 <= left <= right <= n

## Solution Insights

The problem is efficiently solved using a recursive approach. Here's a breakdown of the key insights from the solution:

- **Reversing Sublist:** The solution employs a helper method `reverseN` to reverse the first `n` nodes of the linked list. This method reverses the pointers of the current node and its next node iteratively.
  
- **Tracking Successor Node:** To maintain the connection between the reversed sublist and the rest of the list, a global variable `successor` is used to track the next node after the sublist.
  
- **Recursive Approach:** The `reverseBetween` method recursively reverses the sublist between positions `left` and `right`. If `left` is 1, it directly calls the `reverseN` method to reverse the first `right` nodes. Otherwise, it recursively calls itself on the next node and adjusts the `left` and `right` positions accordingly.

- **Base Case:** When `n` reaches 1 in the `reverseN` method, indicating the target node to reverse, the successor node is set to the next node of the current head, and the current head is returned as the last node of the reversed sublist.

This approach efficiently reverses the sublist within one pass through the linked list, meeting the problem's constraints.
