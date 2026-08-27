Binary Search
class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 5;


        int left = 0, right = nums.length - 1;
        int result = -1;


        while (left <= right) {
            int mid = (left + right) / 2;


            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }


        System.out.println(result);
    }
}

Input:

nums = [1,3,5,7,9]
target = 5

Output:

2
