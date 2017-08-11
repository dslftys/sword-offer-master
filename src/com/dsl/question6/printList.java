package com.dsl.question6;

import com.dsl.utils.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Victor on 2017/7/18.
 * 输入一个链表，从尾到头打印链表每一个节点的值
 */
public class printList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        while(listNode !=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
    public void print(ListNode listNode){
        if(listNode != null){
            if(listNode.next != null){
                print(listNode.next);
            }
            System.out.print(listNode.val);
        }
    }
}
