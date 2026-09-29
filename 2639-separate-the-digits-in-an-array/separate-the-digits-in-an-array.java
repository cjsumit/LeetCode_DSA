class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<n; i++){
            sep(nums[i], ans);

        }
        int i =0;
        int[] arr= new int[ans.size()];
        for(int ele : ans){
            arr[i] = ele;
            i++;
        }
        return arr;
    }
    static void sep(int number, ArrayList<Integer> ans){
        if(number==0) return;
        sep(number/10,ans);
        int digit = number%10;
        ans.add(digit);
    }
    
}