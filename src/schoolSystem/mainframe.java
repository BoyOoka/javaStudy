package schoolSystem;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class mainframe {
	static final int WIDTH  = 800;
	static final int HEIGHT  = 600;
	JFrame buttonframe;
	public mainframe(){
		buttonframe = new JFrame();
		buttonframe.setTitle("学校信息管理系统");
		//设置关闭方法
		buttonframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonframe.setSize(WIDTH, HEIGHT);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width-WIDTH)/2;
		int y = (height=HEIGHT)/2;
		buttonframe.setLocation(x, y);
		buttonframe.setVisible(true);
		JButton student = new JButton("学生信息");
		JButton teacher = new JButton("教师信息");
		JButton leader = new JButton("领导信息");
		//添加相关按钮到buttonframe里
		buttonframe.add(student);
		buttonframe.add(teacher);
		buttonframe.add(leader);
		//设置对象buttonframe的布局管理
		buttonframe.setLayout(new GridLayout(3,1));
		//为student按钮注册事件处理器
		student.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				studentmangerframe studentframe = new studentmangerframe();
			}
		});
		//为teacher事件创建按钮处理器
		teacher.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				teachermanagerframe teacherframe = new teachermanagerframe();
			}
		});
		//为leader事件创建按钮处理器
		leader.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				leadermanagerframe leaderframe = new leadermanagerframe();
			}
		});
	}
}
