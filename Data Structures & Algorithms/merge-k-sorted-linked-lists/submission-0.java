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
        if(lists==null || lists.length==0) return null;

        ListNode res=lists[0];

        int n=lists.length;
        for(int i=1;i<n;i++){
            res= mergeTwo(res,lists[i]);
        }
        return res;
    }

    public ListNode mergeTwo(ListNode res, ListNode l1){
        ListNode dummy= new ListNode(0);
        ListNode curr=dummy;

        while(res!=null && l1!=null ){
            if(res.val<=l1.val) {
                curr.next=res;
                res=res.next;
            }
            else{
                curr.next=l1;
                l1=l1.next;
            }
            curr=curr.next;
        }
        if(res==null)curr.next=l1;
        if(l1==null) curr.next=res;

        return dummy.next;
    }
}
