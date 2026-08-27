Next Greater Element I
Java Code
import java.util.*;


class Main {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};


        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);


        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;


            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            ans[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }
                }
                if (found) break;
            }
        }


        System.out.println(Arrays.toString(ans));
    }
}

Input:

nums1 = [4,1,2]
nums2 = [1,3,4,2]

Output:

[-1,3,-1]
