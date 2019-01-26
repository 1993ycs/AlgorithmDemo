package listdemo;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/26
 * Time:22:53
 */

/**
 * 交换链表相邻位置
 */
public class listDemo24 {
    public static void main(String[] args) throws Exception {
        int arr [] = {1,2,3,4,5,6,7,8};
        ListNode listNode = ListNode.createListNode(arr);
        ListNode.printListNode(listNode);
        System.out.println();
        ListNode.printListNode(listDemo24.swap(listNode));

    }

    /**
     *
     * @param head
     * @return
     */
    private static ListNode swap(ListNode head) throws Exception {
        if (head == null){
            return head;
        }
        if (ListNode.getLen(head) %2 == 1){
            throw new Exception("输入链表长度不合法");
        }
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode cur = pre;

        while (cur.next != null && cur.next.next != null){
            ListNode node1 = cur.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;
            node2.next = node1;
            node1.next = next;
            cur.next = node2;
            cur = node1;
        }
        return pre.next;
    }
}
