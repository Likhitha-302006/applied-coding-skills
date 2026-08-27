class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode previousGroupTail = dummy;

        while (true) {
                       ListNode currentNode = previousGroupTail;

            for (int i = 0; i < k; i++) {
                currentNode = currentNode.next;

                if (currentNode == null) {
                    return dummy.next;
                }
            }

     
            ListNode nextGroupStart = currentNode.next;


            ListNode groupStart = previousGroupTail.next;
            ListNode prev = nextGroupStart;
            ListNode current = groupStart;

            while (current != nextGroupStart) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            previousGroupTail.next = currentNode;

    
            previousGroupTail = groupStart;
        }
    }
}
