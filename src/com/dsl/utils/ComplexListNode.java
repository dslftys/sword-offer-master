package com.dsl.utils;

/**
 * Created by Victor on 2017/8/24.
 */
public class ComplexListNode {
    public int val;
    public ComplexListNode next;
    public ComplexListNode sibling;

    public ComplexListNode(int val) {
        this.val = val;
    }
    public ComplexListNode() {
        this(0);
    }
}
