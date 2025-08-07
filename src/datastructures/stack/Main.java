package datastructures.stack;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);
        System.out.println("First stack\n");
        myStack.printStack();
        // Stack: 11, 3, 23, 7

        myStack.pop();
        // Stack: 3, 23, 7
        System.out.println("Second stack\n");
        myStack.printStack();
    }
}