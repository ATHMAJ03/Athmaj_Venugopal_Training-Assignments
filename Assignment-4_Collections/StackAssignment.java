package Collection;

import java.util.Stack;

public class StackAssignment {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack Elements: " + stack);
        
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}

