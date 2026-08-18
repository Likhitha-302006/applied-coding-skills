Sum of Absolute Differences
import java.util.*;


class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5};


        int n = nums.length;
        int[] ans = new int[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i] += Math.abs(nums[i] - nums[j]);
            }
        }


        System.out.println(Arrays.toString(ans));
    }
}

Input:

2 3 5

Output:

[4, 3, 5]