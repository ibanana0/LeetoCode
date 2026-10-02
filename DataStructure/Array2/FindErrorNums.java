package DataStructure.Array2;
import java.util.Arrays;

public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int expectedSum = nums.length * (nums.length+1)/2;
        Arrays.sort(nums);
        
        int uniqueSum = nums[0];
        int uniqueIndex = 0;

        for(int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
                uniqueSum += nums[uniqueIndex];
            } else if (nums[i] == nums[uniqueIndex]) {
                ans[0] = nums[i];
            }
        }

        ans[1] = expectedSum - uniqueSum;

        return ans;
    }
}
