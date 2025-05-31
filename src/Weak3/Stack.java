package Weak3;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stackValues;

    public Stack() {
        stackValues = new ArrayList<>();
    }

    public void push(int value) {
        stackValues.add(value);
        System.out.println("Pushed: " + value);
    }

    public Integer pop() {
        if (stackValues.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        int value = stackValues.remove(stackValues.size() - 1);
        System.out.println("Popped: " + value);
        return value;
    }

    public Integer get() {
        if (stackValues.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        int value = stackValues.get(stackValues.size() - 1);
        System.out.println("Top of stack: " + value);
        return value;
    }

    public void printStack() {
        System.out.println("Stack contents: " + stackValues);
    }
}
