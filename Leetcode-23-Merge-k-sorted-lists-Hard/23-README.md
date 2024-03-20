# Problem: Merge k Sorted Lists

## Description

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order. Merge all the linked-lists into one sorted linked-list and return it.

### Examples

- **Example 1:**
  - **Input:** lists = [[1,4,5],[1,3,4],[2,6]]
  - **Output:** [1,1,2,3,4,4,5,6]
  - **Explanation:** The linked-lists are:
  [
    1->4->5,
    1->3->4,
    2->6
  ]
  Merging them into one sorted list:
  1->1->2->3->4->4->5->6


- **Example 2:**
  - **Input:** lists = []
  - **Output:** []

- **Example 3:**
  - **Input:** lists = [[]]
  - **Output:** []

### Constraints

- `k == lists.length`
- `0 <= k <= 10^4`
- `0 <= lists[i].length <= 500`
- `-10^4 <= lists[i][j] <= 10^4`
- `lists[i]` is sorted in ascending order.
- The sum of `lists[i].length` will not exceed `10^4`.

## Solution Insights

The challenge in merging `k` sorted lists into a single sorted list lies in efficiently managing the current smallest elements across all lists. A common approach involves using a priority queue to keep track of the smallest element across the heads of all lists. Here's a breakdown of the key insights from the solution:

- **Priority Queue:** A priority queue is initialized to order nodes by their value. This allows for efficient retrieval of the current smallest node across all lists.

- **Initialization:** The first node of each list (if not empty) is added to the priority queue. This sets up our initial state with each list being represented in the queue by its smallest element.

- **Merging Process:** The algorithm repeatedly polls the smallest element from the priority queue to append it to the merged list. If the polled node has a next node, that next node is added to the priority queue. This ensures that the priority queue always contains the current smallest nodes of the lists that haven't been fully merged yet.

- **Dummy Node:** A dummy node is used as a placeholder for the start of the merged list. This simplifies the process of appending nodes and handling edge cases.

- **Traversal and Linking:** A pointer is used to traverse the merged list as nodes are appended. This pointer always points to the last node of the merged list, allowing for constant time appending of the next smallest node.

- **Result:** The head of the merged list is obtained by returning the next node of the dummy node, effectively skipping the dummy node used for initialization.

This approach efficiently merges `k` sorted lists by always selecting the smallest current node available among the lists, ensuring the merged list is sorted.

The maximum number of elements in the priority queue `pq` is `k`, so the time complexity for a single `poll` or `add` operation is `O(logk)`. Since all nodes from the lists will be added to and removed from `pq`, the overall time complexity of the algorithm is `O(Nlogk)`, where `k` is the number of lists and `N` is the total number of nodes in these lists.