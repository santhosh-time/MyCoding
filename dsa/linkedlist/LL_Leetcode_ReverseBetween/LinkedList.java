package dsa.linkedlist.LL_Leetcode_ReverseBetween;

public class LinkedList {
    private Node head;
    private int length;

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
        length = 1;
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // Reverse Between
    /*
     * In the LinkedList class, implement a method called reverseBetween that
     * reverses the nodes of the list between indexes startIndex and endIndex
     * (inclusive).
     * It's important to note that you should only rearrange the nodes themselves,
     * not just their values.
     */
    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null)
            return;
        Node dummyNode = new Node(0);
        Node previousNode = dummyNode;
        dummyNode.next = head;
        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }
        Node currentNode = previousNode.next;
        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }
        head = dummyNode.next;
    }
}
