// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode[] splitListToParts(ListNode head, int k) {
//         ListNode[] res = new ListNode[k];

//         int N = 0;
//         ListNode curr = head;
//         while(curr != null){
//             N++;
//             curr = ucrr.next;
//         }     
//         int splitSize = N / k;
//         int rem = N % k;

//         curr = head;
//         ListNode pre = curr;
//         int currSize = splitSize;
//         if(rem > 0){
//             currSize++;
//             rem--;
//         }
//         int j = 0;
//         while(j < currSize){
//             pre = curr;
//             curr = curr.next;

//         }
//     }
// }
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];

        int N = 0;
        ListNode curr = head;
        while(curr != null){
            N++;
            curr = curr.next;  // fixed typo here
        }     
        int splitSize = N / k;
        int rem = N % k;

        curr = head;
        for (int i = 0; i < k; i++) {
            int currSize = splitSize;
            if(rem > 0){
                currSize++;
                rem--;
            }
            res[i] = curr;
            ListNode pre = null;
            for (int j = 0; j < currSize; j++) {
                pre = curr;
                if(curr != null)
                    curr = curr.next;
            }
            if(pre != null)
                pre.next = null;
        }
        return res;
    }
}
