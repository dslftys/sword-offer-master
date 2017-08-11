package com.dsl.question10;

/**
 * Created by Victor on 2017/8/11.
 * 归纳：如果青蛙跳台阶可以跳一个，两个，三个或者n个问有多种情况，
 * 二阶
 * f(1)=1
 * f(2)=f(2-1)+f(2-2)
 * f(3)=f(3-1)+f(3-2)+f(3-3)=2*(f(2))
 * ...
 * f(n)=f(n-1)+f(n-2)+...f(n-(n-1))+f(n-n)=f(0)+f(1)+..f(n-1)=2*f(n-1)
 */
public class FrogSteps {
    public long step(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return 2*step(n-1);
    }
}
