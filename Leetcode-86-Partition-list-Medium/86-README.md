# Problem: Partition List

## Description

Given the head of a linked list and a value `x`, partition it such that all nodes less than `x` come before nodes greater than or equal to `x`. You should preserve the original relative order of the nodes in each of the two partitions.

### Examples

- **Example 1:**
  - **Input:** head = [1,4,3,2,5,2], x = 3
  - **Output:** [1,2,2,4,3,5]

  ![Partition List Example](partition.jpg "Partition Example")

- **Example 2:**
  - **Input:** head = [2,1], x = 2
  - **Output:** [1,2]

### Constraints

- The number of nodes in the list is in the range `[0, 200]`.
- `-100 <= Node.val <= 100`
- `-200 <= x <= 200`

## Solution Insights

The solution to partitioning a list around a value `x` involves creating two separate linked lists: one for nodes with values less than `x`, and another for nodes with values greater than or equal to `x`. Here's a breakdown of the key insights from the solution:

- **Two Dummy Nodes:** Two dummy nodes are created at the start. One acts as the head for the list containing elements less than `x` (`dummy1`), and the other for elements greater than or equal to `x` (`dummy2`). These dummy nodes simplify the process of building the two lists and handling edge cases.

- **List Iteration:** A single pass through the original list is made, during which each node is evaluated. If a node's value is less than `x`, it is appended to the end of the `dummy1` list. Otherwise, it is appended to the `dummy2` list.

- **Preserving Order:** By appending nodes to the respective lists in the order they appear, the original relative order of nodes within each partition is preserved.

- **Merging Lists:** After the original list has been fully iterated through, the two lists are merged by connecting the end of the `dummy1` list (nodes less than `x`) to the start of the `dummy2` list (nodes greater than or equal to `x`).

- **Detaching Nodes:** To avoid potential cyclic references and to ensure the integrity of the final list, nodes are detached from the original list as they are appended to the `dummy1` or `dummy2` lists.

- **Return Value:** The head of the new, partitioned list is obtained by returning `dummy1.next`, effectively skipping over the dummy node used for list construction.

This approach ensures that all nodes less than `x` come before nodes greater than or equal to `x` while preserving the original relative order of the nodes in each of the two partitions, as required by the problem statement.