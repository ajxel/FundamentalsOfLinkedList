public class TestDLL {
    public static void main(String[] args) {
        // Create a new doubly linked list
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert three elements
        list.insert(1);
        list.insert(2);
        list.insert(3);

        // display elements from head to tail
        list.displayForward();
        list.displayBackward();
    }
    static class DoublyLinkedList {

        // Node class for each element in the doubly linked list
        private static class Node {
            int data; // Data held by the node
            Node prev, next; // Pointers to previous and next nodes

            // constructor initializes node with given data
            Node(int data) {
                this.data = data;
            }
        }
        private Node head, tail; // References to the head and tail of the list

        // Method to insert a new at the end of the list
        public void insert(int value) {
            Node n = new Node(value); // Create a new node with a given value

            if (head == null) {
                // If list is empty, head and tail are both the new node
                head = tail = n;
            }
            else {
                // Link the new node to the end of the list
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
        }

        // Method to display the list from head to tail
        public void displayForward() {
            Node cur = head; // Start from the head
            while (cur != null) {
                System.out.print(cur.data + " < - > "); // Print current node's data
                cur = cur.next; // Move to next node
            }
            System.out.println("null"); // end of the list
        }

        // Method to display the list from tail to head
        public void displayBackward() {
            Node cur = tail; // Start from the tail
            while (cur != null) {
                System.out.print(cur.data + " < - > "); // Print current node's data
                cur = cur.prev;
            }
            System.out.println("null"); // Start of list
        }
    }
}


