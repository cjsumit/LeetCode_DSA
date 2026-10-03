class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode fwrd = head;
        ListNode prev = null;
        while(curr!=null){
            fwrd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwrd;
        }
        return prev;
    }
}