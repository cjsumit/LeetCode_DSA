class Solution {
    public int firstMissingPositive(int[] arr) {
        int n =arr.length;
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }
}