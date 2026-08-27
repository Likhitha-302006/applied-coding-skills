import java.util.*;

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int ans = s2.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return ans;
    }

    public int peek() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int ans = s2.peek();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return ans;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front: " + q.peek());
        System.out.println("Removed: " + q.pop());
        System.out.println("Front: " + q.peek());
        System.out.println("Removed: " + q.pop());
    }
}


Output:
Front: 10
Removed: 10
Front: 20
Removed: 20

