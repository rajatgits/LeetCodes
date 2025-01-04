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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) {
            return head;
        }

        ListNode dummy  = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = dummy;
        ListNode temp = dummy;
        int count = 0;

        while(curr.next != null) {
            count++;
            curr = curr.next;
        } 

        while(count >= k) {
            curr = prev.next;
            temp = curr.next;
            for(int i = 1; i < k; i++) {
                curr.next = temp.next;
                temp.next = prev.next;
                prev.next = temp;
                temp = curr.next;
            }
            prev = curr;
            count -= k;
        }
        return dummy.next;
    }
}
