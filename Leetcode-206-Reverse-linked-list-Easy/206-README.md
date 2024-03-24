# Problem: Reverse Linked List

## Description

Given the head of a singly linked list, reverse the list, and return the reversed list.

### Examples

- **Example 1:**
  - **Input:** head = [1,2,3,4,5]
  - **Output:** [5,4,3,2,1]

  ![Reverse Linked List Example 1](reverse_linked_list_ex_1.jpeg)

- **Example 2:**
  - **Input:** head = [1,2]
  - **Output:** [2,1]

  ![Reverse Linked List Example 2](reverse_linked_list_ex_2.jpeg)

- **Example 3:**
  - **Input:** head = []
  - **Output:** []

### Constraints

- The number of nodes in the list is in the range [0, 5000].
- -5000 <= Node.val <= 5000

## Solution Insights

Reversing a singly linked list can be done either iteratively or recursively. Both approaches offer their own benefits and can be implemented effectively.

- **Iterative Approach:** In this method, we traverse the list while maintaining references to the previous, current, and next nodes. By adjusting the pointers, we reverse the direction of each link until the traversal reaches the end of the list. This approach ensures a time complexity of O(n) and constant space complexity.

- **Recursive Approach:** Recursion offers an elegant solution to reverse a linked list. By recursively traversing the list until reaching the end, we reverse the sublist starting from the second node. Then, we adjust the pointers to reverse the links and return the new head of the reversed list. Despite its simplicity, this approach may lead to stack overflow errors for large lists due to excessive function calls.

Both approaches are valid and can be implemented based on the preference of the developer and the specific requirements of the problem.
