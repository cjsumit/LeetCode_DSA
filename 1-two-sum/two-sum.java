class Solution {
    public int[] twoSum(int[] arr, int target) {

        int[][] nums = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            nums[i][0] = arr[i];
            nums[i][1] = i;
        }

        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 0, j = arr.length - 1;

        while (i < j) {
            long sum = (long) nums[i][0] + nums[j][0];

            if (sum == target) {
                return new int[]{nums[i][1], nums[j][1]};
            } 
            else if (sum > target) {
                j--;
            } 
            else {
                i++;
            }
        }

        return new int[]{-1, -1};
    }
}

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