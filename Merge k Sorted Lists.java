class Main {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode mergeTwoLists(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }

            current = current.next;
        }

        if (a != null)
            current.next = a;
        else
            current.next = b;

        return dummy.next;
    }

    static ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0)
            return null;

        ListNode result = null;

        for (ListNode list : lists) {
            result = mergeTwoLists(result, list);
        }

        return result;
    }

    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(7);

        ListNode b = new ListNode(2);
        b.next = new ListNode(5);
        b.next.next = new ListNode(8);

        ListNode c = new ListNode(3);
        c.next = new ListNode(6);
        c.next.next = new ListNode(9);

        ListNode[] lists = {a, b, c};

        ListNode result = mergeKLists(lists);

        System.out.print("Merged k Lists: ");
        printList(result);
    }
}



Output:

Merged k Lists: 1 2 3 4 5 6 7 8 9
