# Problem: Intersection of Two Linked Lists

## Description

Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:

![Intersecting Linked Lists](160_statement.png)

The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

### Custom Judge

The inputs to the judge are given as follows (your program is not given these inputs):

- **intersectVal:** The value of the node where the intersection occurs. This is 0 if there is no intersected node.
- **listA:** The first linked list.
- **listB:** The second linked list.
- **skipA:** The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
- **skipB:** The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.

The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.

### Examples

- **Example 1:**
  - **Input:** headA = [4,1,8,4,5], headB = [5,6,1,8,4,5], skipA = 2, skipB = 3
  - **Output:** Reference to the node with value = 8
  - **Explanation:** The third node of list A is the intersection point. It is the node with value = 8 in the linked list.

  ![Example 1 Intersection](160_example_1.png)

- **Example 2:**
  - **Input:** headA = [1,9,1,2,4], headB = [3,2,4], skipA = 3, skipB = 1
  - **Output:** Reference to the node with value = 2
  - **Explanation:** The fourth node of list A is the intersection point. It is the node with value = 2 in the linked list.

  ![Example 2 Intersection](160_example_2.png)

- **Example 3:**
  - **Input:** headA = [2,6,4], headB = [1,5], skipA = 3, skipB = 2
  - **Output:** null
  - **Explanation:** There are no intersecting nodes. The lists do not intersect, so the output is null.

  ![Example 3 Intersection](160_example_3.png)

### Constraints

- The number of nodes of listA is in the range `m`.
- The number of nodes of listB is in the range `n`.
- `1 <= m, n <= 3 * 10^4`
- `1 <= Node.val <= 10^5`
- `0 <= skipA < m`
- `0 <= skipB < n`
- `intersectVal` is 0 if listA and listB do not intersect.
- `intersectVal == listA[skipA] == listB[skipB]` if listA and listB intersect.

### Follow-up

Could you write a solution that runs in O(m + n) time and use only O(1) memory?

## Solution Insights

The challenge of finding the intersection point of two linked lists can be efficiently solved using a two-pointer approach. This method does not require additional data structures and operates with O(1) memory complexity, aligning with the follow-up question's requirements. Here's a breakdown of the key insights from the solution:

- **Two-Pointer Technique:** Two pointers are initialized at the heads of the two lists. They traverse the lists, and when one reaches the end, it continues from the beginning of the other list.

- **Intersection Detection:** If the lists intersect, the pointers will meet at the intersection node after traversing the lists. This occurs because they traverse equal lengths when one pointer switches to the beginning of the other list after reaching the end.

- **No Intersection Case:** If there is no intersection, both pointers will eventually become null, indicating that there is no intersection point.

This approach ensures that the intersection node, if it exists, is identified efficiently, meeting the problem's constraints and the follow-up challenge.