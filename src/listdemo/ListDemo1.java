package listdemo;

/**
 * 翻转链表
 */
@SuppressWarnings("ALL")
public class ListDemo1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ListNode listNode = ListNode.createListNode(arr);
        ListNode.printListNode(listNode);
        ListNode listNode1 = reverseList(listNode);
        System.out.println();
        ListNode.printListNode(listNode1);

    }

    /**
     * O(N)
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

}