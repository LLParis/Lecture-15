import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static void main(String[] args) {
        ListNode list = new ListNode(7, new ListNode(16, new ListNode(3)));
        printList(list);
        changeAllNodes(list);
        printList(list);
        System.out.println();

        ListNode list2 = new ListNode(7, new ListNode(16, new ListNode(3)));
        changeLastNode(list2);
        printList(list2);
        System.out.println();

        ListNode list3 = new ListNode(7, new ListNode(16, new ListNode(3)));
        addNodeAtEnd(list3);
        printList(list3);
        System.out.println();
    }

    public static void changeAllNodes(ListNode list) {
        ListNode current = list;
        while (current != null) {
            current.val = 42;
            current = current.next;
        }
    }

    public static void changeLastNode(ListNode list) {
        if (list == null) {
            return;
        }

        ListNode current = list;
        // Traversal of the list
        while (current.next != null) {
            current = current.next;
        }
        current.val = 42;
    }

    public static void addNodeAtEnd(ListNode list) {
        if (list == null) {
            return;
        }

        ListNode current = list;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(42);
    }

    public static void printList(ListNode list) {
        if (list == null) {
            return;
        }

        ListNode current = list;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}

