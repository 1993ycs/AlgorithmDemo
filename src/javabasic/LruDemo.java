package javabasic;

import java.util.HashMap;

public class LruDemo {

    public static void main(String[] args) {
        LruDemo demo = new LruDemo(3);
        demo.put(1,1);
        demo.put(2,2);
        demo.put(3,3);
        System.out.println(demo.get(1));
        demo.put(4,4);
        System.out.println(demo.get(1));
        System.out.println(demo.get(2));


    }
    int cap;
    int size;
    HashMap<Integer, Node> map = new HashMap<>();
    Node head;

    public LruDemo(int cap) {
        this.cap = cap;
        head = new Node();
        head.pre = head;
        head.next = head;
    }
    public Integer get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.remove();
            head.insert(node);
            return node.value;
        }
        return null;
    }

    public void put(int key, int val) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node(key, val);
            head.insert(node);
            map.put(key, node);
            size++;
        } else {
            node.remove();
            node.value = val;
            head.insert(node);
            map.put(key, node);
        }

        if (size > cap) {
            Node remove = head.pre.remove();
            map.remove(remove.key);
            size--;
        }
    }

    static class Node {
        int key;
        int value;
        Node pre;
        Node next;

        public Node() {

        }
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        // pre this (node) next
        public void insert(Node node) {
            Node next = this.next;
            next.pre = node;
            this.next = node;
            node.pre = this;
            node.next = next;
        }
        //pre  pre this next
        public Node remove() {
            next.pre = pre;
            pre.next = next;
            this.pre = null;
            this.next = null;
            return this;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", pre=" + pre +
                    ", next=" + next +
                    '}';
        }
    }


}
