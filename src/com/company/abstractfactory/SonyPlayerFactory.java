package com.company.abstractfactory;

public class SonyPlayerFactory implements PlayerFactory{
    @Override
    public MediaPlayer createMediaPlayer() {
        return new SonyMediaPlayer();
    }

    @Override
    public VideoPlayer createVideoPlayer() {
        return new SonyVideoPlayer();
    }
}
