Move Zeroes
import java.util.*;


class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};


        int j = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }


        System.out.println(Arrays.toString(nums));
    }
}

Input:

0 1 0 3 12

Output:

[1, 3, 12, 0, 0]