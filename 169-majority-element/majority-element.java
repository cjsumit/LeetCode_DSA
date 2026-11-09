// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int count =0;
//         for(int ele : nums){
//             map.put(ele, map.getOrDefault(ele, 0) + 1);
//         }
//         int maxFreq = 0;
//         int maxEle = -1;
//         for (int ele : map.keySet()) {
//             if (map.get(ele) > maxFreq) {
//                 maxFreq = map.get(ele);
//                 maxEle = ele;
//             }
//         }
//         return maxEle;
//     }
// }


class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = nums[i];
            }

            if (element == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}