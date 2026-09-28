class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();

        //Using For loop nested and in the Time Complexity of O(n^2); and time taken 
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



    //     int i=0,j=0;
    //     while(i<nums1.length && j<nums2.length){
    //         if(nums1[i]==nums2[j]){
    //                 if (!ans.contains(nums1[i])) {
    //                     ans.add(nums1[i]);
    //                 }
    //                 j++;
    //             }else i++;
            
            
    //     }
    //    int[] result = new int[ans.size()];
    //    i =0;
    //    for(int ele : ans){
    //     result[i] = ele;
    //     i++;
    //    }

    //    return result;
        
    }
}