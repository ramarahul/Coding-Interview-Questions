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
      PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
        @Override
        public int compare(ListNode l1, ListNode l2){
          return l1.val-l2.val;
        }
      });
      
      ListNode head = new ListNode(0);
      for(ListNode list : lists){
          if(list!=null)
            pq.add(list);
      }
      
      ListNode tail = head;
      while(!pq.isEmpty()){
        tail.next = pq.poll();
        tail=tail.next;
        if(tail.next!=null){
          pq.add(tail.next);
        }
      }
      
      return head.next;
    }
}
