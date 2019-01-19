package listDemo;

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
    ListNode(int x) { value = x; }
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(value);
        while (next != null){
            stringBuffer.append(next.value);
            next = next.next;
        }
        return stringBuffer.toString();
    }

    /**
     * 初始化链表
     * @param arr
     */
    public static ListNode createListNode(int [] arr){
        if (arr == null) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }
    /**
     * 打印链表
     * @param listNode
     */
    public static void printListNode(ListNode listNode){
        if (listNode == null){
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
        do {
            System.out.print(listNode.value);
            System.out.print(" ");
            listNode = listNode.next;
        }while (listNode != null);
    }
}
