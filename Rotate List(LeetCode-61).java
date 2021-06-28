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
        
        if(head == null || k==0) return head;
        
        ListNode curr = head;
        int len = 0;
        while(curr.next!=null){
            len++;
            curr = curr.next;
        }
        len++;
        curr.next = head;
        
        curr = head;
        
        for(int i=0;i<(len - (k%len))-1;i++){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        
        return head;
        
    }
}
