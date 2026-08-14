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
ListNode dummy=new ListNode(0);
dummy.next=head;
ListNode slow=dummy;ListNode fast=head;int count=0;
while(fast!=null){
count++;
fast=fast.next;
}
for(int i=0;i<count-n;i++){
    slow=slow.next;
}
slow.next=slow.next.next;
return dummy.next;
    }
}
