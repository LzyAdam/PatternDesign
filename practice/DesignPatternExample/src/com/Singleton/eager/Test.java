package com.Singleton.eager;

public class Test {
    public static void main(String[] args) {
        SingletonEagerStatic singletonEagerStatic=SingletonEagerStatic.getInstance();
        SingletonEagerStatic singletonEagerStatic1=SingletonEagerStatic.getInstance();
        System.out.println(singletonEagerStatic1==singletonEagerStatic);

        SingletonEagerStatic2 singletonEagerStatic2=SingletonEagerStatic2.getInstance();
    }
}
