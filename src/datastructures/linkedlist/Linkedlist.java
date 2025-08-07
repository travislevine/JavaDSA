// THIS CODE GOES IN YOUR LINKEDLIST CLASS:
// ----------------------------------------
package datastructures.linkedlist;

public class Linkedlist {

    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
        }
    }

    public Linkedlist(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        // Create the new node to append
        Node newNode = new Node(value);

        // If LinkedList is empty, set head and tail to null
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value) {
        // Create the new node to prepends
        Node newNode = new Node(value);

        // Edge case for if no nodes are in the linked list
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            // Point the newnode to the next node that head points to
            newNode.next = head;

            // Reset head to point ot the new node
            head = newNode;
        }
        length++;
    }

//    public Node removeLast() {
//        Node temp = head;
//        Node pre = head;
//        if (length == 0) return null;
//
//        while (temp.next != null) {
//            pre = temp;
//            temp = temp.next;
//        }
//    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public Node get(int index) {
        if (index >= 0 && index <= (length - 1)) {
        Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            return null;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


}

