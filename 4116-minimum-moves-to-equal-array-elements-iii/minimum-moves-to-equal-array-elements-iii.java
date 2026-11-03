class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int k =MaxNum(nums);
        int sum =0;
        for(int i=0; i<n; i++){
            sum += k-nums[i];
        }
        return sum;
    }
    public int MaxNum(int[] nums){
        int maxVal = Integer.MIN_VALUE;
        for(int ele : nums){
            maxVal = Math.max(maxVal,ele);
        }
        return maxVal;
    }
}