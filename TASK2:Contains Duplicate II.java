Contains Duplicate II
import java.util.*;


class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;


        HashSet<Integer> set = new HashSet<>();
        boolean result = false;


        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                result = true;
                break;
            }


            set.add(nums[i]);


            if (set.size() > k)
                set.remove(nums[i - k]);
        }


        System.out.println(result);
    }
}

Input:

nums = [1,2,3,1]
k = 3

Output:

true
