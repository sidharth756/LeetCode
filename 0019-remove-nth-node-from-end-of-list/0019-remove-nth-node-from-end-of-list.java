class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head.next;
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        
        if(fast == null){
            return dummy;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
