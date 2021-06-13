class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode x=null;
        ListNode curr=head;
        ListNode nextNode;
        while(curr!=null){
            nextNode=curr.next;
            curr.next=x;
            x=curr;
            curr=nextNode;
        }
        
        return x;
    }
}