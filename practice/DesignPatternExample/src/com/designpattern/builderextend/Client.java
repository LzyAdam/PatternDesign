package com.designpattern.builderextend;

public class Client {
    public static void main(String[] args) {
        Phone phone =new Phone.Builder()
                .cpu("a15")
                .mainboard("apple")
                .memory("16g")

                .build();
        //Phone phone =new Phone().Builder().build();报错Phone.Builder()才对；
        System.out.println(phone);
    }
}
