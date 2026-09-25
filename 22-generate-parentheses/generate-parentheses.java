class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }
    public void generate(int n, int left, int right, String s, List<String> ans){
        // Ye recursion Pick and Skip recursion jaisa hi hai par sirf uska concept hi...
        if(right==n){//Base Case
            ans.add(s);
            return;
        }
        //Ye function total number of left brackets ko print karega aur ye right ko bhi call kar sakta hai....
        if(left < n)  generate(n,left+1,right,s+"(",ans);
        // Ye function sirf right ko hi call karega aur left aur right brackets ko balance karega....
        if(right < left) generate(n,left,right+1,s+")",ans);
    }
}