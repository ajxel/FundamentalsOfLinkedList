public class Node {
    int data; // data stores the value
    Node next; // next points to the next node
    Node prev; // points to the previous node

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
