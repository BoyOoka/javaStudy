package schoolSystem;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class leadermanagerframe {
	static final int WIDTH  = 800;
	static final int HEIGHT  = 600;
	public leadermanagerframe(){
		JFrame leaderframe = new JFrame();
		leaderframe.setTitle("领导信息");
		leaderframe.setSize(WIDTH, HEIGHT);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width-WIDTH)/2;
		int y = (height-HEIGHT)/2;
		leaderframe.setLocation(x, y);
		leaderframe.setVisible(true);
	}
}
