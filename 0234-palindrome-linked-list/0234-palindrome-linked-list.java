/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reversell(ListNode head){
        if(head == null || head.next == null ){
            return head;
        }
        ListNode newHead = reversell(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head==null || head.next == null) return true;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reversell(slow.next);

        ListNode first = head;
        ListNode second = newHead;
        while(second != null){
            if(first.val != second.val){
                reversell(newHead);
                return false;
            }
            first = first.next;
            second = second.next;            
        }
        return true;
        
    }
}