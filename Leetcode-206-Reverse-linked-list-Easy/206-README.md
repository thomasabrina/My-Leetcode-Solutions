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

### Solution Insights

Reversing a singly linked list can be achieved through various methods, each offering its own set of advantages and considerations.

#### Iterative Approach:

- **Overview:** This method involves traversing the list while maintaining references to the previous, current, and temporary nodes. By manipulating these pointers, the direction of each link is reversed until the traversal reaches the end of the list.
  
- **Implementation Steps:**
  1. Initialize three pointers: `pre` (previous node), `cur` (current node), and `temp` (temporary node).
  2. Traverse the list and update the pointers to reverse the direction of each link.
  3. Return the new head of the reversed list (`pre`).

- **Time Complexity:** O(n), where n is the number of nodes in the linked list.
- **Space Complexity:** O(1).

#### Recursive Approach (with Pointers):

- **Overview:** This method recursively reverses the sublist starting from the second node, then connects the reversed sublist to the current node.
  
- **Implementation Steps:**
  1. Base case: If the list is empty or has only one node, return the head.
  2. Recursively reverse the sublist starting from the second node.
  3. Connect the reversed sublist to the current node by reversing the pointer direction.
  4. Return the new head of the reversed list.

- **Time Complexity:** O(n), where n is the number of nodes in the linked list.
- **Space Complexity:** O(n) due to the recursive function calls.

#### Recursive Approach (with Helper Function):

- **Overview:** This method employs a recursive helper function to reverse the list, allowing for a clean and concise implementation.
  
- **Implementation Steps:**
  1. Define a recursive helper function (`reverse`) that takes `pre` (previous node) and `cur` (current node) as parameters.
  2. Base case: If `cur` is null, return `pre`, which becomes the new head of the reversed list.
  3. Store the next node of `cur` in a temporary variable.
  4. Reverse the direction of `cur`'s pointer to `pre`.
  5. Recursively call the `reverse` function with updated parameters.
  6. Method `reverseList` initiates the recursive reversal by calling the `reverse` function with initial parameters (`null` for `pre` and `head` for `cur`).

- **Time Complexity:** O(n), where n is the number of nodes in the linked list.
- **Space Complexity:** O(n) due to the recursive function calls.


