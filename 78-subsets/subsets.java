class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        subset(ans, nums, 0, list);

        return list;
    }

    public static void subset(List<Integer> ans, int[] arr,int idx, List<List<Integer>> list) {

        if(idx == arr.length) {
            list.add(new ArrayList<>(ans));
            return;
        }

        // Taking the number
        ans.add(arr[idx]);
        subset(ans, arr, idx + 1, list);

        // Skipping the number
        ans.remove(ans.size() - 1);
        subset(ans, arr, idx + 1, list);
    }
}