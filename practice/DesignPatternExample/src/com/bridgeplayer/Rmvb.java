package com.bridgeplayer;

public class Rmvb implements Video{
    @Override
    public void decode(String filename) {
        System.out.println("RMVB"+filename);
    }
}
