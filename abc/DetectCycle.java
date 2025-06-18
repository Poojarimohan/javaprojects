package abc;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) {
        val = x;
        next = null;
    }
}

public class DetectCycle {
    public boolean hasCycle(ListNode2 head) {
        ListNode2 slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode2 head = new ListNode2(3);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(0);
        head.next.next.next = new ListNode2(-4);
        head.next.next.next.next = head.next;  // creates cycle

        DetectCycle obj = new DetectCycle();
        System.out.println("Has Cycle: " + obj.hasCycle(head));
    }
}

