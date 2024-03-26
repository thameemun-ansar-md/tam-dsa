package com.tam.dsa.trees.core;

public class BinaryTree<T extends Comparable<T>> {
    Node<T> root;
    public void add(T data) {
        root = recursiveAdd(data, root);
    }
    private Node<T> recursiveAdd(T data, Node<T> current) {
        if(current == null) {
           return new Node<T>(data);
        }
        if(data.compareTo(root.data)>0) {
            current.right = recursiveAdd(data, current.right);
        } else if(data.compareTo(root.data)<0) {
            current.left = recursiveAdd(data, current.left);
        }
        return current;
    }
}
