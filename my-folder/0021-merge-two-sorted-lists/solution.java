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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;

        while(curr1 != null && curr2 != null) {
            if(curr1.val < curr2.val) {
                node.next = curr1;
                curr1 = curr1.next;
            } else {
                node.next = curr2;
                curr2 = curr2.next;
            }
            node = node.next;
        }
        
        if(curr1 != null) {
            node.next = curr1;
        } else {
            node.next = curr2;
        }
        return dummy.next;
    }
}
