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

            // Save the start of the next group
            ListNode nextGroupStart = currentNode.next;

            // Reverse the current group
            ListNode groupStart = previousGroupTail.next;
            ListNode prev = nextGroupStart;
            ListNode current = groupStart;

            while (current != nextGroupStart) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            // Connect previous group to reversed group
            previousGroupTail.next = currentNode;

            // Move to the next group
            previousGroupTail = groupStart;
        }
    }
}