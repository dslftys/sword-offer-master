package com.dsl.question9;

/**
 * Created by Victor on 2017/8/11.
 */
public class TwoTest {
    public static void main(String[] args) throws Exception {
        TwoStackForQueue<Integer> twoStackForQueue=new TwoStackForQueue();
        twoStackForQueue.appendTail(1);
        twoStackForQueue.appendTail(2);
        System.out.println(twoStackForQueue.deleteHead());
        twoStackForQueue.appendTail(3);
        twoStackForQueue.appendTail(4);
        int size=twoStackForQueue.size();
        for(int i=0;i<size;i++){
            System.out.println(twoStackForQueue.deleteHead());
        }
        System.out.println("我是分隔符");
        TwoQueueForStack<Integer> twoQueueForStack=new TwoQueueForStack<>();
        twoQueueForStack.push(1);
        twoQueueForStack.push(2);
        System.out.println(twoQueueForStack.pop());
        twoQueueForStack.push(3);
        twoQueueForStack.push(4);
        int size2=twoQueueForStack.size();
        for(int i=0;i<size2;i++){
            System.out.println(twoQueueForStack.pop());
        }

    }
}
