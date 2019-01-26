package listdemo;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/19
 * Time:20:47
 */

/**
 * 删除有序链表的重复节点
 */
public class ListDemo83 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,3,3,4,5,5};
        ListNode listNode = ListNode.createListNode(arr);
        ListNode.printListNode(listNode);
        System.out.println();
        ListNode.printListNode(deleteDuplicates(listNode));


    }

    private static ListNode deleteDuplicates(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode next = cur.next;
        ListNode pre = null;
        while (next != null){
            if (cur.value == next.value) {
                next = next.next;
                continue;
            }
            cur = cur.next;
        }
        return head;


    }
}
