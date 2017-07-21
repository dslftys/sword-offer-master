package com.dsl;

import java.util.Stack;

/**
 * Created by Victor on 2017/7/21.
 */
public class Q5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);//stack2负责装，stack1负责出
    }

    public int pop() {
        if(stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        return stack1.pop();
    }

    public static void main(String[] args) {
        Q5 q=new Q5();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(4);
        System.out.println(q.pop());
        q.push(5);
        System.out.println(q.pop());
        System.out.println(q.pop());

    }
}
