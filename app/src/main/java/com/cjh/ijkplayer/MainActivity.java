package com.cjh.ijkplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cjh.myijkplayer.widget.media.IjkVideoView;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class MainActivity extends AppCompatActivity {

    private IjkVideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView = (IjkVideoView) findViewById(R.id.video_view);

        //initPlayer
        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");


        mVideoView.setVideoPath("http://183.250.3.57:8880/bei01.mp4");
        mVideoView.start();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mVideoView.stopPlayback();
        mVideoView.release(true);
        mVideoView.stopBackgroundPlay();
    }
}
