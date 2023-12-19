package com.bridgeplayer;

public class Avi implements Video{
    @Override
    public void decode(String filename) {
        System.out.println("avi video"+filename);
    }
}
