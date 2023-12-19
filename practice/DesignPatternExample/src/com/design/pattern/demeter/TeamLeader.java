package com.design.pattern.demeter;

public class TeamLeader implements Manager{
    private Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void assignTask(){
        System.out.println(" assign task to programmer of");
        if(programmer instanceof JavaProgrammer){
            programmer.work();
        }else if(programmer instanceof com.design.pattern.demeter.PythonProgrammer) {
            ((PythonProgrammer)programmer).work();
        }
    }


}
