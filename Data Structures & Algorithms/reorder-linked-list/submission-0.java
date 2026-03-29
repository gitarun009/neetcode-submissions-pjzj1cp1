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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode start=head;
        ListNode end=reverse(slow.next);
        slow.next=null;
        
        while(end!=null){
            ListNode t1=start.next;
            ListNode t2=end.next;
            
            start.next=end;
            end.next=t1;

            start=t1;
            end=t2;
        }
    }
    public ListNode reverse(ListNode start){
        if(start==null || start.next==null)return start;

        ListNode newHead=reverse(start.next);
        start.next.next=start;
        start.next=null;
        return newHead;
    }
}
