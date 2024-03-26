class MyLinkedList {

    int size; // Variable to keep track of the size of the linked list
    ListNode dummyHead; // Dummy head node to simplify insertion and deletion

    // Inner class to represent a node in the linked list
    class ListNode {
        int val;
        ListNode next;
        
        ListNode() {}
        
        ListNode(int val) {
            this.val = val;
        }   
    }

    // Constructor to initialize the linked list
    public MyLinkedList() {
        size = 0;
        dummyHead = new ListNode(); // Initialize the dummy head node
    }
    
    // Method to get the value at a specific index in the linked list
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1; // Invalid index, return -1
        }
        ListNode cur = dummyHead.next; // Start from the node after the dummy head
        while (index > 0) { // Traverse to the desired index
            cur = cur.next;
            index--;
        }
        return cur.val; // Return the value at the desired index
    }
    
    // Method to add a node with a given value at the beginning of the linked list
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val); // Create a new node with the given value
        newNode.next = dummyHead.next; // Set the new node's next pointer to the node after the dummy head
        dummyHead.next = newNode; // Update the dummy head's next pointer to point to the new node
        size++; // Increment the size of the linked list
    }
    
    // Method to add a node with a given value at the end of the linked list
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val); // Create a new node with the given value
        ListNode cur = dummyHead; // Start traversal from the dummy head
        while (cur.next != null) { // Traverse to the last node
            cur = cur.next;
        }
        cur.next = newNode; // Set the next pointer of the last node to the new node
        size++; // Increment the size of the linked list
    }
    
    // Method to add a node with a given value at a specific index in the linked list
    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return; // Invalid index, do nothing
        }
        ListNode newNode = new ListNode(val); // Create a new node with the given value
        ListNode cur = dummyHead; // Start traversal from the dummy head
        while (index > 0) { // Traverse to the node before the desired index
            cur = cur.next;
            index--;
        }
        newNode.next = cur.next; // Insert the new node between cur and cur.next
        cur.next = newNode;
        size++; // Increment the size of the linked list
    }
    
    // Method to delete the node at a specific index in the linked list
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return; // Invalid index, do nothing
        }
        ListNode cur = dummyHead; // Start traversal from the dummy head
        while (index > 0) { // Traverse to the node before the one to delete
            cur = cur.next;
            index--;
        }
        cur.next = cur.next.next; // Skip the node to delete
        size--; // Decrement the size of the linked list
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */