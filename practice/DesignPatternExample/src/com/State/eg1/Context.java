package com.State.eg1;

public class Context {
    public final static  OpenState OPEN_STATE=new OpenState();
    public final static CloseState CLOSE_STATE= new CloseState();
    public final static RunState Run_STATE= new RunState();
    public final static StopState Stop_STATE= new StopState();

    private LifeState lifeState;

    public LifeState getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
        this.lifeState.setContext(this);
    }
    public void open(){
        this.lifeState.open();
    }
    public void stop(){
        this.lifeState.stop();
    }
    public void run(){
        this.lifeState.run();
    }
    public void close(){
        this.lifeState.close();
    }
}
