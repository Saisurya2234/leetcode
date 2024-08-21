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
    public ListNode mergeKLists(ListNode[] list) {
        if(list.length==0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val-b.val);
        for(ListNode node:list){
            if(node!=null)
            q.offer(node);
        }
        while(!q.isEmpty()){
            ListNode head = q.poll();
            temp.next = head;
            temp = temp.next;
            if(head.next!=null){
                q.add(head.next);
                } 
        }
        return dummy.next;
        
    }
}