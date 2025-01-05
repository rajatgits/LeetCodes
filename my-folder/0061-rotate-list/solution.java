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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int len = 1;

        while(temp.next != null) {
            temp = temp.next;
            len += 1;
        }

        if(k % len == 0) {
            return head;
        }

        k = k % len;

        temp.next = head;
        ListNode tail = findTail(head, len - k);

        head = tail.next;
        tail.next = null;

        return head;
    }

    private ListNode findTail(ListNode temp, int k) {
        int count = 1;
        while(temp != null) {
            if(count == k) {
                return temp;
            }
            count++;
            temp = temp.next;
        }
        return temp;
    }
}
