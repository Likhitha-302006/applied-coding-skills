Online Stock Span
Java Code
import java.util.*;


class StockSpanner {
    Stack<int[]> stack = new Stack<>();


    public int next(int price) {
        int span = 1;


        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }


        stack.push(new int[]{price, span});
        return span;
    }
}


class Main {
    public static void main(String[] args) {
        StockSpanner s = new StockSpanner();


        int[] prices = {100, 80, 60, 70, 60, 75, 85};


        for (int price : prices)
            System.out.print(s.next(price) + " ");
    }
}

Input:

100 80 60 70 60 75 85

Output:

1 1 1 2 1 4 6
