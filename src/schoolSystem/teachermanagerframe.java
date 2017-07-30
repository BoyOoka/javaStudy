package schoolSystem;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class teachermanagerframe extends JPanel {
	static final int WIDTH  = 500;
	static final int HEIGHT  = 300;
	public teachermanagerframe(){
		JFrame teacherframe = new JFrame();
		teacherframe.setTitle("教师信息");
		teacherframe.setSize(WIDTH, HEIGHT);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width-WIDTH)/2;
		int y = (height-HEIGHT)/2;
		teacherframe.setLocation(x, y);
		teacherframe.setVisible(true);
		teacherframe.add(this,BorderLayout.CENTER);
		//创建各种按钮对象
		JButton computerteacher = new JButton("计算机系教师系统");
		JButton bioteacher = new JButton("生物系教师系统");
		JButton mechteacher = new JButton("机械系教师系统");
		JButton bereturn = new JButton("返回");
		//创建标签
		JLabel title = new JLabel("教师系统主界面");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		//设置对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.CENTER;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 0;
		constraints.weighty = 4;
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1,3));
		jp.add(title);
		jp.add(banket1);
		jp.add(banket2);
		teacherframe.add(jp,BorderLayout.NORTH);
		//添加组件到布局网格
		add(computerteacher,constraints,0,2,1,1);
		add(bioteacher,constraints,0,3,1,1);
		add(mechteacher,constraints,0,4,1,1);
	}
	//创建按照网格组布局方式排列的组件放发
		public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
			constraints.gridx = x;
			constraints.gridy = y;
			constraints.gridwidth = w;
			constraints.gridheight = h;
			add(c,constraints);
		}
}
