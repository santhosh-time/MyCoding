package dsa.linkedlist.LL_Leetcode_BinaryToDecimal;

public class LinkedList {
    private Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public void makeEmpty() {
        head = null;
    }

    public void printList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) { // As thete is no leangth and tail
            head = newNode; // head will be New Node
        } else {
            Node current = head; // As tail is unknown and length. We will check with current
            while (current.next != null) {// to get the last Node who points to null, means getting tail
                current = current.next; // Point to next node
            }
            current.next = newNode; // appending
        }

    }

    // binary to decimal
    // You have a linked list where each node represents a binary digit (0 or 1).
    // The goal of the binaryToDecimal function is to convert this binary number,
    // represented by the linked list, into its decimal equivalent.
    public int binaryToDecimal() {
        int num = 0;
        Node current = head;
        while (current != null) {
            num = 2 * num + current.value;
            current = current.next;
        }
        return num;
    }
}
