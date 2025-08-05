package datastructures.stack;

public class Stack {
    private  Node top; // The top most node in the stack
    private int height; // Effectively the 'length' of the stack

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public Stack(int value) {
        // New node to insert into the stack
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (height == 0) {
            return null;
        } else {
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
            return temp;
        }
    }


    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

}

