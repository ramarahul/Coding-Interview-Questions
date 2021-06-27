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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((n1,n2) -> (n1.val-n2.val));
        for(ListNode list : lists){
            if(list!=null){
                pq.add(list);
            }
        }
        
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;
        while(!pq.isEmpty()){
            ListNode n = pq.remove();
            current.next = n;
            current = current.next;
            if(current.next!=null){
                pq.add(current.next);
            }
        }
        
        return dummyHead.next;
    }
}
