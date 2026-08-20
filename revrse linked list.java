class Solution {
public ListNode reverseList(listNode head) {
ListNode prev = null;
ListNode cur=head;
while(cur ! =null)
ListNode temp =cur.next;
cur.next=prev;
prev=cur;
cur=temp;
}
retuen prev;
}
}