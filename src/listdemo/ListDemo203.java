package listdemo;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/26
 * Time:22:06
 */

/**
 * 参数链表中某个值
 */
public class ListDemo203 {
    public static void main(String[] args) {
        int [] arr = {5,5,2,2,3,4,5,0,5,9,5};
        int [] arr1 = {5,5,5};
        ListNode listNode  = ListNode.createListNode(arr);
        ListNode.printListNode(listNode);
        System.out.println();
        ListNode.printListNode(deteFun1(listNode, 5));

    }

    private static ListNode deteFun(ListNode listNode, int value){
//        if (null == listNode){
//            return listNode;
//        }
        while (null != listNode && listNode.value == value){
            listNode = listNode.next;
        }
        if (null == listNode){
            return listNode;
        }
        ListNode cur = listNode;
        while ( cur.next != null){
            if (cur.next.value == value){
                ListNode detListNode = cur.next;
                cur.next = detListNode.next;
            }else {
                cur = cur.next;
            }
        }
        return listNode;
    }

    /**
     * 设立虚拟头结点
     * @param listNode
     * @param value
     * @return
     */
    private static ListNode deteFun1(ListNode listNode, int value){
//        if (null == listNode){
//            return listNode;
//        }
//        while (null != listNode && listNode.value == value){
//            listNode = listNode.next;
//        }

        if (null == listNode){
            return listNode;
        }

        ListNode pre = new ListNode();
        pre.next = listNode;
        ListNode cur = pre;
        System.out.println(cur.next.value);
        while ( cur.next != null){
            if (cur.next.value == value){
                ListNode detListNode = cur.next;
                cur.next = detListNode.next;
            }else {
                cur = cur.next;
            }
        }
        return pre.next;
    }
}
