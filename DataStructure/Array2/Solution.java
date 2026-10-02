package DataStructure.Array2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // -- FindErrorNums --
        var sol = new FindErrorNums();
        int[] nums = {3,2,3,4,6,5};
        int[] ans = sol.findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
}
