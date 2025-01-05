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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode lessOrEqual = new ListNode(-1);
        ListNode currLess = lessOrEqual;
        ListNode greater = new ListNode(-1);
        ListNode currGreater = greater;

        while(temp != null) {
            if(temp.val < x) {
                currLess.next = temp;
                currLess = currLess.next;
            } else {
                currGreater.next = temp;
                currGreater = currGreater.next;
            }
            temp = temp.next;
        }
        currLess.next = greater.next;
        currGreater.next = null;
        
        return lessOrEqual.next;
    }
}
