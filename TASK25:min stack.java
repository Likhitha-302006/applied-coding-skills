import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    int top() {
        return stack.peek();
    }

    int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        System.out.println("Minimum: " + s.getMin());

        s.pop();

        System.out.println("Top: " + s.top());
        System.out.println("Minimum: " + s.getMin());
    }
}



Output:

Minimum: 2
Top: 7
Minimum: 3
