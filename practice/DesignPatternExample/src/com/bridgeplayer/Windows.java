package com.bridgeplayer;

public class Windows extends OS{
    public Windows(Video video) {
        super(video);
    }

    @Override
    public void play(String filename) {
        video.decode(filename);
    }
}
