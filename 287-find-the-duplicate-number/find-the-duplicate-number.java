class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;

int i = 0;

    while(i < arr.length) {

        if(arr[i] == i + 1) {
            i++;
        }
        else {
            int idx = arr[i] - 1;

            if(arr[idx] == arr[i]) {
                return arr[i];
            }

            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }

    return -1;
        //Using For Loop in O(n^2) time Complexity...
        
        // for(i =0; i<n; i++){
        //     for(int j =i+1; j<n; j++){
        //         if(arr[i]==arr[j]) return arr[i];
        //     }
        // }
        // return 23;
    }
}