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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head2= reverse(head);
        ListNode dummy=new ListNode(-1);
        dummy.next=head2;
        ListNode curr=dummy;

        while(n!=1){
            curr=curr.next;
            n--;
        }
        curr.next= curr.next.next;

        return reverse(dummy.next);
        
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        
        ListNode newHead= reverse(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
}
