package com.dsl.question2;

/**
 * Created by Victor on 2017/8/9.
 */
public class Singleton {
    //懒汉式(需要时才创建)
    private static Singleton singleton;
    private Singleton() {//设置成private不让外部自己建立实例。
    }
    public static Singleton getSingleton(){
        if(singleton == null){
            singleton=new Singleton();
        }
        return  singleton;
    }
}

//进行懒汉式实施时，可能两个线程都来获取实例，都判断为null时，这时会导致成生成两个实例。加线程锁，如果一个线程获得实例，另外一个等待
class Singleton2 {
    //懒汉式(需要时才创建)
    private static Singleton2 singleton2;
    private Singleton2() {//设置成private不让外部自己建立实例。
    }
    public synchronized static Singleton2 getSingleton(){
        if(singleton2 == null){
            singleton2=new Singleton2();
        }
        return  singleton2;
    }
}

/**
 * 然而以上有个问题，当实例不为空时就不需要进行加锁。
 */
class Singleton3 {
    //懒汉式(需要时才创建)
    private static Singleton3 singleton3;
    private Singleton3() {//设置成private不让外部自己建立实例。
    }
    public synchronized static Singleton3 getSingleton(){
        if(singleton3 == null){
            synchronized (Singleton3.class){
                if(singleton3 == null){
                    singleton3=new Singleton3();
                }
            }
        }
        return  singleton3;
    }
}


//饿汉式,是一种线程安全的写法
class Singleton4{
    private static Singleton4 singleton4=new Singleton4();
    private Singleton4() {//设置成private不让外部自己建立实例。
    }
    public static Singleton4 getSingleton4(){
        if(singleton4 == null){
            singleton4=new Singleton4();
        }
        return  singleton4;
    }
}

/**
 *如果想往getSingleton中加参数，就必须用懒汉式，但有个问题是每次加载时都要生成实例。导致时间比较久。
 * 静态内部类实现方式
 */
class Singleton5{
    private static final class SingletionHolder{
        private static final Singleton5 instance=new Singleton5();
    }
    private Singleton5(){

    }
    public static Singleton5 getSingleton(){
        return  SingletionHolder.instance;
    }
}