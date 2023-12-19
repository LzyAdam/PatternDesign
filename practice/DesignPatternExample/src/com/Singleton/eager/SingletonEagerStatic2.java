package com.Singleton.eager;

public class SingletonEagerStatic2 {
    private SingletonEagerStatic2(){

    }
    private static SingletonEagerStatic2 singletonEagerStatic2;

    static {
         singletonEagerStatic2=new SingletonEagerStatic2();
    }
    public static SingletonEagerStatic2 getInstance(){
        return singletonEagerStatic2;
    }
}
