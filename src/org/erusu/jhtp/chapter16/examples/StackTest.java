package org.erusu.jhtp.chapter16.examples;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();

        stack.push(12L);
        System.out.printf("Pushed 12L\n");
        printStack(stack);

        stack.push(34567);
        System.out.printf("Pushed 34567\n");
        printStack(stack);

        stack.push(1.0F);
        System.out.printf("Pushed 1.0F\n");
        printStack(stack);

        stack.push(1234.5678);
        System.out.printf("Pushed 1234.5678 \n");
        printStack(stack);

        try {
            Number removedObject = null;

            while(true) {
                removedObject = stack.pop();
                System.out.printf("Popped %s\n", removedObject);
                printStack(stack);
            }
        } catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }

    private static void printStack(Stack<Number> stack) {
        if(stack.isEmpty())
            System.out.printf("stack is empty\n\n");
        else
            System.out.printf("stack contains: %s (top)\n", stack);
    }
}