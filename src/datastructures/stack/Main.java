package datastructures.stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);
        System.out.println("First stack\n");
        myStack.printStack();
        // Stack:

        myStack.pop();
        // Stack:
        System.out.println("Second stack\n");
        myStack.printStack();
    }
}