//Using Brute Force..
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i =0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[i] +nums[j] == target){
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return null;
        
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =1;i<nums.length;i++){
            for(int j =i;j<nums.length;j++){
                if(nums[j] + nums[j-i] == target){
                    return new int[] {j,j-i};
                }
            }
        }
        return null;
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             int n=target-nums[i];
//             if(map.containsKey(n))
//             {
//                 return new int[]{map.get(n),i};
//             }
//             else
//             {
//                 map.put(nums[i],i);
//             }
//         }
//         return new int[]{};
        
//     }
// }

// class Solution {
//     public int[] twoSum(int[] arr, int target) {

//         int[][] nums = new int[arr.length][2];

//         for (int i = 0; i < arr.length; i++) {
//             nums[i][0] = arr[i];
//             nums[i][1] = i;
//         }

//         Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

//         int i = 0, j = arr.length - 1;

//         while (i < j) {
//             long sum = (long) nums[i][0] + nums[j][0];

//             if (sum == target) {
//                 return new int[]{nums[i][1], nums[j][1]};
//             } 
//             else if (sum > target) {
//                 j--;
//             } 
//             else {
//                 i++;
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }

// class Solution {
//     public int[] twoSum(int[] arr, int target) {
//         int i = 0, j = arr.length - 1;

//         while (i < j) {
//             int sum = arr[i] + arr[j];

//             if (sum == target) {
//                 return new int[]{i, j};
//             } else if (sum > target) {
//                 j--;
//             } else {
//                 i++;
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }