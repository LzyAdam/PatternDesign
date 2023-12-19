package com.Singleton.eager;

public class SingletonEagerStatic {
    //1 private constructor
    private SingletonEagerStatic(){}
    //2 create a object
    private static SingletonEagerStatic singletonEagerStatic=new SingletonEagerStatic();


    public static SingletonEagerStatic getInstance(){
        return singletonEagerStatic;
    }





}
