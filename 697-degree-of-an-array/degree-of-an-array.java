class Solution {
    public int findShortestSubArray(int[] nums) {

        int max = 0;

        // Find maximum value
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];
        int[] first = new int[max + 1];
        int[] last = new int[max + 1];

        // Count frequency and store first/last positions
        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if(count[num] == 0) {
                first[num] = i;
            }

            count[num]++;
            last[num] = i;
        }

        // Find degree
        int degree = 0;

        for(int i = 0; i < count.length; i++) {
            if(count[i] > degree) {
                degree = count[i];
            }
        }

        // Find shortest subarray having the degree
        int ans = nums.length;

        for(int i = 0; i < count.length; i++) {

            if(count[i] == degree) {

                int length = last[i] - first[i] + 1;

                if(length < ans) {
                    ans = length;
                }
            }
        }

        return ans;
    }
}