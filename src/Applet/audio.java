package Applet;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JApplet;

//播放声音
public class audio extends Applet {
	AudioClip voice;
	public void init(){
		URL u = null;
		u = this.getClass().getClassLoader().getResource("/Users/gaya/Downloads/song.wav");
		//为对象voice赋值，实现播放音乐
		voice = getAudioClip(getCodeBase(),"song.wav");
//		voice = JApplet.newAudioClip(u);
		File f = new File("");
		System.out.println(f.getAbsolutePath());
	}
	public void start(){
		System.out.println("播放");
		voice.loop();
	}
	public void stop(){
		voice.stop();
		System.out.println("结束");
	}
		
}
