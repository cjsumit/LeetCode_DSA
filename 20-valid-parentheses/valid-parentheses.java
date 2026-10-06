class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch=='[') st.push(ch);
            else{ //checking closing brackets..
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(SameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return (st.isEmpty());
    }

    static  boolean SameStyle(char a, char b) {
        if(a=='(' && b==')') return true;
        if(a=='{' && b=='}') return true;
        if(a=='[' && b==']') return true;
        return false;
    }
}