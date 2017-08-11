package com.dsl.question10;

/**
 * Created by Victor on 2017/8/11.
 * 裴波那契数列，青蛙跳台阶，可以一个也可以两个，问有几种情况。
 *
 */
public class Fibonacci {
    public long Fibonacci(int n){
        if(n == 0 || n==1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    //改进，递归重复计算太多
    public long Fibonacci2(int n){
        if(n == 0 || n==1){
            return n;
        }
        long current=0;
        long one =0;//现在数据的前两个
        long two=1;
        for(int i=2;i<=n;i++){
            current=one+two;
            one=two;//对前两个数据进行记录
            two=current;
        }
        return current;

    }
}
