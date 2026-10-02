// import java.util.Arrays;

public class Solution {
        public static void main(String[] args) {
            // -- Shuffle --
            // var sol = new Shuffle();
            // int[] nums = {2, 5, 1, 3, 4, 7};
            // int n = 3;
            // int[] result = sol.shuffle(nums, n);
            // System.out.println(Arrays.toString(result));

            // -- FindMaxConsecutiveOnes --
            var sol = new FindMaxConsecutiveOnes();
            int[] nums = {1,1,0,1,1,1};
            Integer ans = sol.findMaxConsecutiveOnes(nums);
            System.out.println(ans);
    }
}
