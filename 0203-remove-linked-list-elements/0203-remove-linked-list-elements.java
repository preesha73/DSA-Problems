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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode temp = new ListNode(0, head);

        ListNode prev = temp;
        ListNode current = head;

        while(current != null){
            if(current.val == val){
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return temp.next;
    }
}