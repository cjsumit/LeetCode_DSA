class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};
        int n = arr.length;
        int low = 0,high=n-1,idx=-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==target) {
                idx=mid;
                high = mid-1;
            }
            else if(arr[mid]>target) high = mid-1;
            else low = mid+1;
        }
        low =0;high=n-1;
        int idx1=-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==target) {
                idx1=mid;
                low = mid+1;
            }
            else if(arr[mid]>target) high = mid-1;
            else low = mid+1;
        }
        if (idx != -1) {
            ans = new int[]{idx,idx1};
        }
        return ans;
    }
}