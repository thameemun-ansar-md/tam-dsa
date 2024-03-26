package com.tam.dsa.trees.core;

public class Node<T extends Comparable<T>> {
    T data;
    Node left;
    Node right;
    public Node(T data) {
        this.data = data;
    }
}
