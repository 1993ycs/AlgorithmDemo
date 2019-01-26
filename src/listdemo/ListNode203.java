package listdemo;

/**
 * author:ycs
 * email: yucs2017@163.com
 * Date:2019/1/26
 * Time:23:21
 */

import java.util.prefs.NodeChangeEvent;

/**
 * 删除链表中某个节点
 */
public class ListNode203 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};
        ListNode listNode = ListNode.createListNode(arr);
        ListNode.printListNode(listNode);

        ListNode node = ListNode.findNode(listNode, 6);
         new ListNode203().deleNode(node);
         ListNode.printListNode(listNode);
    }
//o(n)
    private void  deleNode(ListNode node){
        if (node == null){
            return ;
        }
        if (node.next == null){
            node = null;
        }
        ListNode next = node.next;
        node.value = next.value;
        node.next = next.next;
        return ;
    }
}
