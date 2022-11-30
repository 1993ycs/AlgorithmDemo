package listdemo;

public class ReverseListNode {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};

        ListNode node = ListNode.createListNode(nums);
      //  ListNode.printListNode(node);
        ListNode reverse = reverse(node);
        ListNode.printListNode(reverse);
        ListNode.printListNode(node);

    }
    private static ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
