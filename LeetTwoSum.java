// https://leetcode.com/problems/two-sum/description/
class LeetTwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    int[] index = { i, j };
                    return index;
                }
            }
        }
        int[] index =  {0, 1};
        return index;
    }
}
