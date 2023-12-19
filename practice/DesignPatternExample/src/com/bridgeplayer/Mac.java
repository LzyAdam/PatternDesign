package com.bridgeplayer;

public class Mac extends OS{

    public Mac(Video video) {
        super(video);
    }

    @Override
    public void play(String filename) {
        video.decode(filename);
    }
}
