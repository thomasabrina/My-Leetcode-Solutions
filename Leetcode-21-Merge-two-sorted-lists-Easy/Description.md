# Problem: Merge Two Sorted Lists

## Description

Given the heads of two sorted linked lists `list1` and `list2`, the task is to merge the two lists into one sorted list. The final sorted list should be made by splicing together the nodes of the first two lists without creating new nodes but by rearranging the existing ones. The function should return the head of the merged linked list.

### Examples

- **Example 1:**
  - Input: `list1 = [1,2,4]`, `list2 = [1,3,4]`
  - Output: `[1,1,2,3,4,4]`
  
  ![Merge Two Sorted Lists Example](merge_ex1.jpg "Merge Example")

- **Example 2:**
  - Input: `list1 = []`, `list2 = []`
  - Output: `[]`

- **Example 3:**
  - Input: `list1 = []`, `list2 = [0]`
  - Output: `[0]`

### Constraints

- The number of nodes in both lists is in the range `[0, 50]`.
- `-100 <= Node.val <= 100`
- Both `list1` and `list2` are sorted in non-decreasing order.