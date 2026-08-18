Best Time to Buy and Sell Stock
class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};


        int minPrice = prices[0];
        int profit = 0;


        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            profit = Math.max(profit, price - minPrice);
        }


        System.out.println(profit);
    }
}

Input:

7 1 5 3 6 4

Output:

5