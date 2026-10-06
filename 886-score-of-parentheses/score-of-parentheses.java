class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        int count =0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch=='[') st.push(ch);
            else{ //checking closing brackets..
                if(st.isEmpty()) return -1;
                char top = st.peek();
                if(top=='(' && ch==')'){
                    st.pop();
                     if (s.charAt(i - 1) == '(') {
                        count += (1 << st.size());
                    }
                }
            }
        }
        return count;
    }

}