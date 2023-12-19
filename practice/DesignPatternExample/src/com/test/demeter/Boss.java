package com.test.demeter;

public class Boss implements Manager {

    public void meet(TeamLeader teamLeader){
        System.out.println("boss meeting");
        teamLeader.assignTask();

    }

}
