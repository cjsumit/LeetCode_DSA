class Solution {
    public int clumsy(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n);
        n--;
        int op = 1;
        while(n>0){
            if(op==1){
               int a= st.pop();
               st.push(a*n);
            }
            else if(op==2){
                int a= st.pop();
                st.push(a/n);
            }
            else if(op==3) st.push(n);
            else st.push(-n);
            op = (op%4) + 1;
            n--;
        }
        int sum =0;
        while(!st.isEmpty()) sum += st.pop();

        return sum;
    }
}