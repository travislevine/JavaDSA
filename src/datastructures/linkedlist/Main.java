// THIS GOES IN YOUR MAIN CLASS TO TEST YOUR CODE:
// -----------------------------------------------

package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.getHead(); // 1
        myLinkedList.getTail(); // 1
        myLinkedList.getLength(); // 1

        myLinkedList.append(3);

        myLinkedList.getHead();// 3
        myLinkedList.getTail(); // 1
        myLinkedList.getLength(); // 2
        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            
            Linked List:
            4

        */

    }

}