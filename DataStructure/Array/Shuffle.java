public class Shuffle { 
    public int[] shuffle(int[] nums, int n) {
        int grouped = 0;
        int[] ans = new int[nums.length];
        if (nums.length == 2*n) {
            for(int i = 0; i < nums.length/2; i++) {
                ans[grouped] = nums[i];
                ans[grouped + 1] = nums[i + n];
                grouped += 2;
            }
        } else {
            System.out.println("Invalid n");
        }

        return ans;
    }
}