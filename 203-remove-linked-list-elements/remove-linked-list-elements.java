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
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head!=null){
            if(head.val!=val){
                temp.next=head;
                temp=temp.next;
            }
            head=head.next;
        }
        temp.next=null;
        return dummy.next;
        
    }
}