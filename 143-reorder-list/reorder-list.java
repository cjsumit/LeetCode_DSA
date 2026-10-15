class Solution {
    public void reorderList(ListNode head) {
        // USING STACK..

        // ListNode slow = head;
        // ListNode fast = head;
        // Stack<ListNode> st = new Stack<>();
        // while(fast!=null && fast.next!= null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // ListNode head2 = slow.next;
        // slow.next = null;
        // slow = head;
        // while(head2!=null) {
        //     st.push(head2);
        //     head2 = head2.next;
        // }
        // while(st.size()>0){
        //     ListNode top = st.pop();
        // //    if(top.next != null && slow.next != null){
        //     top.next = slow.next;
        //     slow.next = top;
        //     slow = top.next;
        // //    }
        // }

        //USING LINKEDLIST..

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
        ListNode prev  = null;
        ListNode curr = head2;
        fast = head2;
        while(curr!=null) {
            fast = fast.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }
        ListNode i = head;
        ListNode j = prev;
        ListNode k = head;
        while(j!=null){
            k = i.next;
            i.next = j;
            i =j;
            j = j.next;
            i.next = k;
            i =k;
        }
    }
}