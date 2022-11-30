package listdemo;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/19
 * Time:19:21
 */

/**
 * 链表定义
 */
public class ListNode {
    int value;
    ListNode next;
    ListNode pre;

    ListNode(int x) {
        value = x;
    }

    ListNode() {

    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(value);
        while (next != null) {
            stringBuffer.append(next.value);
            next = next.next;
        }
        return stringBuffer.toString();
    }

    /**
     * 初始化链表
     *
     * @param arr
     */
    public static ListNode createListNode(int[] arr) {
        if (arr == null) {
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 0; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head.next;
    }

    /**
     * 打印链表
     *
     * @param listNode
     */
    public static void printListNode(ListNode listNode) {
        if (listNode == null) {
            System.out.println("链表为空");
        }
//        if (listNode.next == null){
//            System.out.println(listNode.value);
//            return;
//        }
//        while (listNode.next != null){
//            System.out.print(listNode.value);
//            System.out.print(" ");
//            listNode = listNode.next;
//        }
        ListNode pre = new ListNode();
        pre = listNode;
        do {
            System.out.print(pre.value);
            System.out.print("->");
            pre = pre.next;
        } while (pre != null);
        System.out.print("NULL");
        System.out.println();
    }

    public static int getLen(ListNode listNode) {
//       / if (listNode == null){
//            return 0;
//        }
        int count = 0;
        ListNode cur = listNode;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;

    }

    public static ListNode findNode(ListNode listNode, int x) {

        ListNode curNode = listNode;
        while (curNode != null) {
            if (curNode.value == x) {
                return curNode;
            }
                curNode = curNode.next;
            }
        return null;
    }
}
