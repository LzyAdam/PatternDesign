package com.design.pattern.demeter;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        //method1
        //boss.meet(new TeamLeader().setProgrammer(new PythonProgrammer()););

        //method2
        TeamLeader teamLeader = new TeamLeader();

        JavaProgrammer javaProgrammer=new JavaProgrammer();
        PythonProgrammer pythonProgrammer = new PythonProgrammer();
        boss.meet(teamLeader);

        teamLeader.setProgrammer(javaProgrammer);
        teamLeader.assignTask();
        teamLeader.setProgrammer(pythonProgrammer);
        teamLeader.assignTask();




        System.out.println("11111111111");

        TeamLeader t = new TeamLeader();
        t.setProgrammer(new PythonProgrammer());
        t.assignTask();

        System.out.println("11111111111");
        TeamLeader p=new TeamLeader();
        p.setProgrammer(new JavaProgrammer());
        p.assignTask();

    }
}
