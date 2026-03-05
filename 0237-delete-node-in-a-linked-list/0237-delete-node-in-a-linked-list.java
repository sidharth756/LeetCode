/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        while(temp.next != null){
            temp = temp.next;
            node.val = temp.val;

            if(temp.next == null){
                node.next = null;
                break;
            }
            node = node.next;
        }
    }
}