package com.dsl.question30;

import java.util.Stack;

/**
 * Created by Victor on 2017/8/23.
 */
public class StackWithMin {
    private Stack<Integer> dataStack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();

    public void push(Integer data){
        dataStack.push(data);
        if(minStack.size() ==0|| data<=minStack.peek()){
            minStack.push(data);
        }else{
            minStack.push(minStack.peek());
        }
    }
    public Integer pop(){
        minStack.pop();
        return dataStack.pop();
    }
    public Integer min(){
        return minStack.peek();
    }
}
