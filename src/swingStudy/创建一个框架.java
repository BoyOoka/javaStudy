package swingStudy;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class 创建一个框架 {
	static final int WIDTH = 500;
	static final int HEIGHT = 300;
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出
		jf.setResizable(true);//窗口大小可改变
		jf.setTitle("学生管理系统");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);//将窗口放在屏幕正中央
		//创建两个按钮对象b1,b2
		JButton b1 = new JButton("确定");
		JButton b2 = new JButton("取消");
		//创建三个选择按钮
		JRadioButton jr1 = new JRadioButton("忽略",true);//默认被选
		JRadioButton jr2 = new JRadioButton("继续");
		JRadioButton jr3 = new JRadioButton("跳过");
		//创建单选按钮组对象
		ButtonGroup bg = new ButtonGroup();
		//添加到按钮组后只能单选
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		//添加复选框
		JCheckBox jc1 = new JCheckBox("选择一");
		JCheckBox jc2 = new JCheckBox("选择二");
		JCheckBox jc3 = new JCheckBox("选择三");
		jc1.setSelected(true);
		//创建一个toggleButton
		JToggleButton jt1 = new JToggleButton("按下");
		//将按钮添加到面板p
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		p.add(jr1);
		p.add(jr2);
		p.add(jr3);
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		p.add(jt1);
		jf.add(p,BorderLayout.CENTER);//将对象添加到窗口
//		jf.show();
		jf.setVisible(true);
	}

}
