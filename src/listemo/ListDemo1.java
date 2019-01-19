package listemo;

import java.util.LinkedList;

/**
 *
 */
public class ListDemo1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ListNode listNode = ListNode.createListNode(arr);
        ListNode.printListNode(listNode);
        ListNode listNode1 = reverseList(listNode);
        System.out.println();
        ListNode.printListNode(listNode1);
        System.out.println(reverseList(listNode1));

    }

    /**
     * o(n)
     * @param listCode
     * @return
     */
    private static ListNode reverseLsit(ListNode listCode){
        if (listCode == null || listCode.next == null){
            return listCode;
        }
        ListNode pre = null;
        ListNode cur = listCode;
        while (listCode != null){
            ListNode next = cur.next;
            pre = cur;
            cur = next;
        }
        return pre;
    }
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
