class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int[] row : matrix) {
            for(int ele : row) {
                ans.add(ele);
            }
        }
        Collections.sort(ans);
        return ans.get(k-1);
    }
}