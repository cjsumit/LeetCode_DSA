class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<ListNode> st = new Stack<>();
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        slow = head;
        while(head2!=null) {
            st.push(head2);
            head2 = head2.next;
        }
        while(st.size()>0){
            ListNode top = st.pop();
        //    if(top.next != null && slow.next != null){
            top.next = slow.next;
            slow.next = top;
            slow = top.next;
        //    }
        }
    }
}