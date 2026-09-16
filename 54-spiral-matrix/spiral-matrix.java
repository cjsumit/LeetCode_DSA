class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int fc =0, fr=0,lr=arr.length-1,lc=arr[0].length-1;
        while(fc<=lc){
            for(int i = fc; i<=lc; i++){
                ans.add(arr[fc][i]);
            } fr++;
            if(fc>lc || fr>lr) break;
            for(int i = fr; i<=lr; i++){
                ans.add(arr[i][lc]);
            }lc--;
            if(fc>lc || fr>lr) break;
            for(int i = lc; i>=fc; i--){
                ans.add(arr[lr][i]);
            }
            lr--;
            if(fc>lc || fr>lr) break;
            for(int i = lr; i>=fr; i--){
                ans.add(arr[i][fc]);
            }
            fc++;
        }
        return ans;
    }
}