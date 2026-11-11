class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        int count =0;
        for(int ele : nums){
            if(!ans.contains(ele)){
                ans.add(ele);
                count++;
            }
        }
        int[] expectedNums = new int[count];
        int j =0;
        for(int ele : ans) expectedNums[j++] = ele;
        Arrays.sort(expectedNums);
        for (int i = 0; i < count; i++) {
           nums[i] = expectedNums[i];
        }
        return count;
    }
}