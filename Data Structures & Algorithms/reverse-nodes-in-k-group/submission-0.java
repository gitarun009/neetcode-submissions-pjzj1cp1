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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevEnd=dummy;

        while(true){
            ListNode kth=prevEnd;
            for(int i=0;i<k && kth!=null; i++){
                kth=kth.next;
            }
            if(kth==null) break;
            ListNode groupStart=prevEnd.next;
            ListNode nextStart=kth.next;

            ListNode curr=groupStart;
            ListNode prev=nextStart;

            while(curr!=nextStart){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            prevEnd.next=kth;
            prevEnd=groupStart;
        }
        return dummy.next;
    }
}
