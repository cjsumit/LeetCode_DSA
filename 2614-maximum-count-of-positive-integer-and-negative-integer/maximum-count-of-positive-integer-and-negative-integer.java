class Solution {
    public int maximumCount(int[] arr) {

        int n = arr.length;

        // Find first positive
        int low = 0;
        int high = n - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] <= 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        int positiveCount = n - low;


        // Find first non-negative
        low = 0;
        high = n - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        int negativeCount = low;


        return Math.max(positiveCount, negativeCount);
    }
}