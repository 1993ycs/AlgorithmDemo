package listdemo;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/26
 * Time:23:43
 */
public class ListDemo19 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};
        ListNode listNode = ListNode.createListNode(arr);
        ListNode.printListNode(listNode);
        ListNode.printListNode(ListDemo19.deleN(listNode,1));
    }

    private static ListNode  deleN(ListNode listNode, int n){
        ListNode pre = new ListNode();
        pre.next = listNode;
        ListNode node1 = pre;
        ListNode node2 = pre;
        //前一个节点先走N步
        for (int i = 0; i < n+1; i++) {
            if (node1 == null){
                throw  new IllegalArgumentException("n值不对");
            }
            node1 = node1.next;
        }
        //两个节点一起走直到前一个节点为NULL
        while (node1 != null){
            node1 = node1.next;
            node2 = node2.next;
        }
        System.out.println(node2.value);

        node2.next = node2.next.next;
        return pre.next;

    }
}
