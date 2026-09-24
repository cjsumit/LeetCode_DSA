class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int minval= 0;
        for(int i=0; i<n; i++){
            int temp = nums[i];
            int sum = reverse(temp,0);
            minval = Math.max(minval,sum);
            if(sum == i) return i;
        }
        return -1;
    }
    static  int reverse(int number,int sum){
        if(number==0) return sum;
        int digit = number%10;
        return reverse(number/10,sum+digit);
    }
    
}