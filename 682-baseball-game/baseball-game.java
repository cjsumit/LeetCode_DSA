class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st = new Stack<>();
        int sum =0;
        for(int i =0; i<s.length; i++){
            String ch = s[i];
            if(ch.equals("+")){
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                st.push(first+second);
            }
            else if(ch.equals("D")){
                st.push(2*st.peek());
            }
            else if(ch.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        while(!st.isEmpty()) sum += st.pop();

        return sum;
    }
}