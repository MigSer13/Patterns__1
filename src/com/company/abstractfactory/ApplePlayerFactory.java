package com.company.abstractfactory;

public class ApplePlayerFactory implements PlayerFactory{
    @Override
    public MediaPlayer createMediaPlayer() {
        return new AppleMediaPlayer();
    }

    @Override
    public VideoPlayer createVideoPlayer() {
        return new AppleVideoPlayer();
    }
}
