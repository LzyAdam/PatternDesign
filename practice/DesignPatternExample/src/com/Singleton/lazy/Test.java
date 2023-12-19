package com.Singleton.lazy;

public class Test {
    public static void main(String[] args) {
        SignletonLazy signletonLazy=SignletonLazy.getInstance();
        SignletonLazy signletonLazy1=SignletonLazy.getInstance();
        System.out.println(signletonLazy1==signletonLazy);


    }
}
