package com.bridgeplayer;

public abstract class OS {
    protected  Video video;

    public OS(Video video) {
        this.video = video;
    }
    public  abstract  void play(String filename);
}
