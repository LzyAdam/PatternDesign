package com.Singleton.lazy;

public class SignletonLazy {
    private SignletonLazy(){

    }
    private static SignletonLazy signletonLazy;
    public static SignletonLazy getInstance(){
        if(signletonLazy==null){
            signletonLazy=new SignletonLazy();
        }
        return signletonLazy;
    }
}
/*
public class LazySingleton {

    // Private constructor to prevent instantiation from outside the class
    private LazySingleton() {
        // Initialization code, if needed
    }

    // Private static instance variable
    private static LazySingleton instance;

    // Public method to get the singleton instance
    public static LazySingleton getInstance() {
        // Check if the instance is null (not created yet)
        if (instance == null) {
            // If null, create a new instance
            instance = new LazySingleton();
        }

        // Return the instance
        return instance;
    }
}

 */