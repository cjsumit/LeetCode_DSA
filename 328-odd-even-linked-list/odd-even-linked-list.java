class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head; // CHANGED

        ListNode odd = new ListNode();
        ListNode odd1 = odd;
        ListNode even = new ListNode();
        ListNode even1 = even;
        ListNode temp = head;

        while (temp != null) {
            // CHANGED: Save the next node before changing links
            ListNode next = temp.next;

            odd1.next = temp;              // CHANGED
            odd1 = odd1.next;               // CHANGED
            temp = next;                    // CHANGED

            if (temp != null) {
                next = temp.next;           // CHANGED

                even1.next = temp;          // CHANGED
                even1 = even1.next;         // CHANGED
                temp = next;                // CHANGED
            }
        }

        odd1.next = null;
        even1.next = null;

        // CHANGED: Connect the end of the odd list to the even list
        odd1.next = even.next;

        return odd.next;                    // CHANGED
    }
}