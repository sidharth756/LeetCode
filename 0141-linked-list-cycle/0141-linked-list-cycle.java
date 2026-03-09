
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode slow = head;
        ListNode fast = head;
        while( fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast )
                return true;
        }
        return false;
    }
}