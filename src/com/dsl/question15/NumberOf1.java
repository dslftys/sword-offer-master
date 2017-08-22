package com.dsl.question15;

/**
 * Created by Victor on 2017/8/20.
 */
public class NumberOf1 {
    public int numberOf1(int n){
        int count=0;

        while(n>0){
            ++count;
            n=(n-1)&n;
        }
        return count;
    }
}
