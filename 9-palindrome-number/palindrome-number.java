class Solution {
    public boolean isPalindrome(int x) {
        // String s = Integer.toString(x);
        // int i =0; int j = s.length()-1;
        // while(i<=j){
        //     if(s.charAt(i)!=s.charAt(j)) return false;
        //     i++;
        //     j--;
        // }
        // return true;


        int val =x,rem=0,deg=0;
        while(val>0){
            deg = val%10;
            rem = 10*rem+deg;
            val = val/10;
        }
        if(rem!=x) return false;
        else return true;
    }
}