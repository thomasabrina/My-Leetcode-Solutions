# Problem: Remove Nth Node From End of List

## Description

Given the head of a linked list, the task is to remove the nth node from the end of the list and return its head. This must be achieved in a way that only requires a single pass through the list.

### Examples

- **Example 1:**
  - Input: `head = [1,2,3,4,5]`, `n = 2`
  - Output: `[1,2,3,5]`

  ![Remove Nth Node From End Example](remove_ex1.jpg "Remove Example")
  
- **Example 2:**
  - Input: `head = [1]`, `n = 1`
  - Output: `[]`

- **Example 3:**
  - Input: `head = [1,2]`, `n = 1`
  - Output: `[1]`

### Constraints

- The number of nodes in the list is `sz`.
- `1 <= sz <= 30`
- `0 <= Node.val <= 100`
- `1 <= n <= sz`

## Solution Insights

The solution to remove the nth node from the end of the list involves a two-pointer technique to traverse the list in a single pass. Here's a breakdown of the key insights from the solution:

- **Dummy Node:** A dummy node is created and placed before the head of the list. This simplifies edge cases, such as removing the head of the list, by ensuring consistent node removal logic.

- **Two-Pointer Technique:** Two pointers are used, where the first pointer advances `n + 1` steps from the dummy node, and the second pointer starts from the dummy node. Both pointers then move forward in the list at the same pace until the first pointer reaches the end. At this point, the second pointer is exactly at the node before the one that needs to be removed.

- **Node Removal:** The node to be removed is skipped by changing the `next` reference of the node before it to point to the node after it. This effectively removes the target node from the list.

- **Return Value:** The head of the modified list is returned by returning `dummy.next`, which accounts for the case where the head of the list was removed.

This approach ensures that the nth node from the end is removed with only a single pass through the list, meeting the problem's requirements and constraints.