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

## Solution Insights

The solution to merge two sorted lists involves a straightforward approach using the concept of pointers to traverse through both lists simultaneously. Here's a breakdown of the key insights from the solution:

- **Dummy Node:** A dummy node is initially created with a value of `-1`. This node acts as a precursor to the merged list, simplifying edge cases and eliminating the need for separate handling of the head node. The merged list is built starting from this dummy node.

- **Pointer Movement:** Two pointers, `p1` and `p2`, are used to traverse `list1` and `list2` respectively. A third pointer, `p`, is attached to the dummy node and is used to build the merged list by pointing to the next appropriate node from either `list1` or `list2`.

- **Comparison and Attachment:** As we traverse through both lists, the values of the nodes pointed by `p1` and `p2` are compared. The node with the smaller value is attached to the merged list by setting `p.next` to it. This process continues until one of the lists is completely traversed.

- **Remaining Elements:** After one of the lists is exhausted, the remaining elements of the other list are attached to the merged list. This is done by directly linking the last node of the merged list to the remaining part of the non-exhausted list.

- **Return Value:** The head of the merged list is obtained by returning `dummy.next`, effectively skipping the dummy node.

This solution ensures that the merged list is sorted and made by splicing together the nodes of the first two lists without creating new nodes, adhering to the problem's constraints and requirements.