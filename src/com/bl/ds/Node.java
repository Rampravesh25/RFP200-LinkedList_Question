package com.bl.ds;

public class Node<K> {
    Node<K> next;
    K key;

    Node(K key) {
        this.key = key;
    }

    Node() {
    }
}
