# Ijkplayer

自己编译完Ijkplayer后获得的SO包，如果要用只要把MyIjkplayer下载后依赖到主目录里面就可以。

1，在主项目里面依赖MyIjkplayer;

    dependencies {
        compile fileTree(include: ['*.jar'], dir: 'libs')
        compile 'com.android.support:appcompat-v7:25.3.1'
        compile 'com.android.support.constraint:constraint-layout:1.0.0-alpha7'
        compile project(':MyIjkplayer')
    }


2，在要使用布局文件里面添加：
    
    <com.cjh.myijkplayer.widget.media.IjkVideoView
        android:id="@+id/video_view"
        android:layout_width="match_parent"
        android:layout_height="200dp"/>
        
3，在onCreate里面添加：

    //initPlayer
    IjkMediaPlayer.loadLibrariesOnce(null);
    IjkMediaPlayer.native_profileBegin("libijkplayer.so");
    
4，开始播放：
    
    mVideoView.setVideoPath("http://183.250.3.57:8880/bei01.mp4");
    mVideoView.start();
    
5，效果如下：


最后： 
      其他的就是Ijkplayer的使用api，这点就需要自己去看官方API了。
  
  
