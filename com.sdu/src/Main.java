import java.util.Arrays;

class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int[] preArr = getPreArr(nums);
        int[] sufArr = getSufArr(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (preArr[i] > 1 && sufArr[i] > 1) {
                ans = Math.max(ans, preArr[i] + sufArr[i] - 1);
            }
        }
        return nums.length - ans;
    }

    private int[] getPreArr(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }

    private int[] getSufArr(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = nums.length - 2; i > -1; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }

}