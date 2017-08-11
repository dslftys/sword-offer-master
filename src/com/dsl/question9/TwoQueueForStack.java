package com.dsl.question9;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Victor on 2017/8/11.
 */
public class TwoQueueForStack<T> {
    private Queue<T> queue1=new LinkedList<>();
    private Queue<T> queue2=new LinkedList<>();

    public void push(T data) throws Exception {
        if((queue1.size()>0&&queue2.size()>0)){
            throw new Exception("Error");
        }
        if(queue1.size()>0){
            queue1.add(data);
        }else{
            queue2.add(data);
        }
    }
    public Integer size(){
        return queue1.size()+queue2.size();
    }
    public T pop(){
        if(queue1.size()>0){
            while(queue1.size()-1>0){//留一个弹出
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }else{
            while(queue2.size()-1>0){//留一个弹出
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }
    }
}
