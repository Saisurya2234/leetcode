/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int length = 0;
         while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(s!=f){
            f=f.next;
            s=s.next;
        }
        return s;

    }
}