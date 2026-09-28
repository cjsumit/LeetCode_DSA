class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();

        //Using For loop nested and in the Time Complexity of O(n^2); and time taken 7ms..
        //Worst case....


         for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!ans.contains(nums1[i])) {
                        ans.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[ans.size()];
        int i = 0;
        for (int ele : ans) {
            result[i] = ele;
            i++;
        }

        return result;


        //Optimal approach ...
        // Using Set..

        // Set<Integer> set1 = new HashSet<>();
        // Set<Integer> result = new HashSet<>();

        // for (int num : nums1) {
        //     set1.add(num);
        // }

        // for (int num : nums2) {
        //     if (set1.contains(num)) {
        //         result.add(num);
        //     }
        // }

        // int[] answer = new int[result.size()];
        // int i = 0;

        // for (int num : result) {
        //     answer[i] = num;
        //     i++;
        // }

        // return answer;
    }
}