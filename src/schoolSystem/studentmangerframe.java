package schoolSystem;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class studentmangerframe extends JPanel{
	static final int WIDTH  = 800;
	static final int HEIGHT  = 600;
	JFrame studentframe;
	public studentmangerframe(){
		studentframe = new JFrame();
		studentframe.setTitle("学生信息");
//		studentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentframe.setSize(WIDTH, HEIGHT);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width-WIDTH)/2;
		int y = (height-HEIGHT)/2;
		studentframe.setLocation(x, y);
		studentframe.setVisible(true);
		studentframe.add(this,BorderLayout.CENTER);
		//创建一些按钮对象
		JButton conputerone = new JButton("计算机系一班学生信息系统");
		JButton conputertwo = new JButton("计算机系二班学生信息系统");
		JButton conputerthree = new JButton("计算机系三班学生信息系统");
		JButton bioone = new JButton("生物系一班学生信息系统");
		JButton mechone = new JButton("机械系一班学生信息系统");
		JButton mechtwo = new JButton("机械系二班学生信息系统");
		JButton mechthree = new JButton("机械系三班学生信息系统");
		//创建一些标签
		JLabel tile = new JLabel("学生信息系统主界面");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		//创建布局管理器lay
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		//创建并设置对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.weightx = 2;
		constraints.weighty = 5;
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1,3));
		//添加各种对象到jp
		jp.add(tile);
		jp.add(banket1);
		jp.add(banket2);
		//添加对象jp到studentframe
		studentframe.add(jp,BorderLayout.NORTH);
		//通过调用方法add实现利用网格组布局添加控件
		add(conputerone,constraints,0,1,1,1);
		add(conputertwo,constraints,0,2,1,1);
		add(conputerthree,constraints,0,3,1,1);
		add(bioone,constraints,0,4,1,1);
		add(mechone,constraints,1,1,1,1);
		add(mechtwo,constraints,1,2,1,1);
		add(mechthree,constraints,1,3,1,1);
		//单机这个按钮进入计算机系一班学生系统
		conputerone.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String sql = "select * from studentinfo where class='一班' and major='计算机系'";
				studentinfo info = new studentinfo("计算机系一班学生信息系统",sql,"计算机系");
			}
		});
		conputertwo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String sql = "select * from studentinfo where class='二班' and major='计算机系'";
				studentinfo studentinformation = new studentinfo("计算机系二班学生信息",sql,"计算机系");
			}
		});
		conputerthree.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String sql = "select * from studentinfo where class='三班' and major='计算机系'";
				studentinfo info = new studentinfo("计算机系三班学生信息",sql,"计算机系");
			}
		});
		bioone.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String sql = "select * from studentinfo where class='一班' and major='生物系'";
				studentinfo info = new studentinfo("生物系一班学生信息",sql,"生物系");
			}
		});
		mechone.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String sql = "select * from studentinfo where class='一班' and major='机械系'";
				studentinfo info = new studentinfo("机械系一班学生信息",sql,"机械系");
			}
		});
		mechtwo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String sql = "select * from studentinfo where class='二班' and major='机械系'";
				studentinfo info = new studentinfo("机械系二班学生信息",sql,"机械系");
			}
		});
		mechthree.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String sql = "select * from studentinfo where class='三班' and major='机械系'";
				studentinfo info = new studentinfo("机械系三班学生信息",sql,"机械系");
			}
		});
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

