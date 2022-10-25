package demo;

import java.util.HashMap;
import java.util.Map;

public class LRUCache1 {
    int cap;
    int size;
    Node head;

    Map<Integer,Node> map;

    private LRUCache1() {

    }

    private LRUCache1(int cap) {
        map = new HashMap<>(cap);
        this.size = 0;
        this.cap = cap;
        head = new Node();
        head.pre = head;
        head.next = head;
    }


    public int get(int  key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        node.remove();
        head.insert(node);
        return node.val;
    }


    public void put(int key, int val) {
        Node node = map.get(key);
        if (node != null) {
            node.remove();
            node.val = val;
        } else  {
            node = new Node(key, val);
            map.put(key, node);
            size ++;
        }
        head.insert(node);
        if (size > cap) {
            Node remove = head.pre.remove();
            map.remove(remove.key);
            size--;
        }
    }



    static class Node {
        int key;
        int val;
        Node pre;
        Node next;
        public Node() {

        }


        public Node(int  key, int val) {
            this.key = key;
            this.val = val;
        }



        public Node remove() {
            pre.next = next;
            next.pre = pre;
            this.next = null;
            this.pre = null;
            return this;
        }


        public Node insert(Node node) {
            // pre this next
            this.next = node;
            this.next.pre = node;
            node.pre = this;
            node.next = next;
            return  node;
        }
    }


}
