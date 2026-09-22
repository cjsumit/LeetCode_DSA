class Solution {
    public int missingNumber(int[] arr) {
        // int n =arr.length;
        // int i =0;
        // while(i<arr.length){
        //     if(arr[i]==i || arr[i]==n) i++;
        //     else{
        //         int idx = arr[i];
        //         int temp = arr[idx];
        //         arr[idx] = arr[i];
        //         arr[i] = temp;
        //     }
        // }
        // for(i=0;i<arr.length;i++){
        //     if(arr[i] != i) return i;
        // }
        // return n;


        int xor=0;
        xor=xor^arr.length;
        for(int i=0;i<arr.length;i++){
            xor=xor^i^arr[i];
        }
        return xor;

    }
}