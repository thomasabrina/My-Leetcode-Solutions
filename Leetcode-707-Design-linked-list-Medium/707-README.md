# Problem: Design Linked List

## Description

Design your implementation of the linked list. You can choose to use a singly or doubly linked list. A node in a singly linked list should have two attributes: `val` and `next`. `val` is the value of the current node, and `next` is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute `prev` to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the `MyLinkedList` class:

- `MyLinkedList()` Initializes the `MyLinkedList` object.
- `int get(int index)` Get the value of the `index`th node in the linked list. If the index is invalid, return -1.
- `void addAtHead(int val)` Add a node of value `val` before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
- `void addAtTail(int val)` Append a node of value `val` as the last element of the linked list.
- `void addAtIndex(int index, int val)` Add a node of value `val` before the `index`th node in the linked list. If `index` equals the length of the linked list, the node will be appended to the end of the linked list. If `index` is greater than the length, the node will not be inserted.
- `void deleteAtIndex(int index)` Delete the `index`th node in the linked list, if the index is valid.

### Examples

- **Example 1:**
  - **Input:** `["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]`
             `[[], [1], [3], [1, 2], [1], [1], [1]]`
  - **Output:** `[null, null, null, null, 2, null, 3]`

- **Example 2:**
  - **Input:** `["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]`
             `[[], [1], [3], [1, 2], [1], [1], [1]]`
  - **Output:** `[null, null, null, null, 2, null, 3]`

- **Example 3:**
  - **Input:** `["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]`
             `[[], [1], [3], [1, 2], [1], [1], [1]]`
  - **Output:** `[null, null, null, null, 2, null, 3]`

### Constraints

- 0 <= index, val <= 1000
- Please do not use the built-in LinkedList library.
- At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex, and deleteAtIndex.

## Solution Insights

Implementing a linked list using a dummy head node and a `ListNode` class allows for efficient insertion, deletion, and traversal operations. This approach provides a clean and concise implementation of a singly linked list.

- **Node Structure:** Each node in the linked list is represented by the `ListNode` class, containing two attributes: `val` to store the value of the node and `next` to reference the next node in the list.

- **Initialization:** The linked list is initialized with a `dummyHead` node, which serves as the starting point of the list. This dummy node simplifies the implementation of insertion and deletion operations, especially at the head of the list.

- **Size Tracking:** A `size` variable is used to keep track of the number of nodes in the linked list. This enables efficient retrieval of the list size and validation of index bounds during operations.

- **Get Operation:** Retrieving the value of a node at a specific index is performed by traversing the list starting from the `dummyHead` node. If the index is valid, the traversal continues until reaching the desired node.

- **Add Operation:** Adding a node at the head of the list involves creating a new node with the specified value and updating the `next` pointer of the `dummyHead` node to point to the new node. Adding a node at the tail of the list requires traversing the list until reaching the last node and appending the new node to its `next` pointer.

- **Add at Index Operation:** Adding a node at a specific index involves traversing the list until reaching the node preceding the insertion point. Then, the new node is inserted by updating the `next` pointer of the preceding node to point to the new node, and the `next` pointer of the new node to the node originally at the insertion index.

- **Delete Operation:** Deleting a node at a specific index is performed by traversing the list until reaching the node preceding the deletion point. Then, the `next` pointer of the preceding node is updated to skip over the node to be deleted, effectively removing it from the list.

- **Time and Space Complexity:** The time complexity of most operations, such as get, add, and delete, is O(n), where n is the number of nodes in the linked list. This is because these operations may require traversing the entire list to locate the target node. The space complexity is O(1) as no additional data structures are used besides the linked list itself.
