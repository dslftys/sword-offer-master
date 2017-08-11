package com.dsl.question9;

import java.util.Stack;

/**
 * Created by Victor on 2017/8/11.
 */
public class TwoStackForQueue<T> {
    private Stack<T> stack1=new Stack<>();//插入时放入的栈
    private Stack<T> stack2=new Stack<>();//拿出时用的栈

    public void appendTail(T data){
        stack1.push(data);
    }
    public Integer size(){
        return stack2.size()+stack1.size();
    }
    public T deleteHead() throws Exception {
        if(stack2.isEmpty()){
            while(stack1.size() >0){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("no data");
        }
        return stack2.pop();
    }
}
