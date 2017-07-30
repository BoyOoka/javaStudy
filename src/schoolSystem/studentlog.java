package schoolSystem;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class studentlog {

	public static void main(String[] args) {
		login log = new login();
	}

}
class login extends JPanel{
	static final int WIDTH = 400;
	static final int HEIGHT = 200;
	JFrame loginframe;
	//创建按照网格组布局方式排列的组件放发
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c,constraints);
	}
	login(){
		//创建界面框架
		loginframe = new JFrame("信息管理系统");
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//创建网格布局管理器的对象
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		//添加当前对象到登录界面
		JButton ok2 = new JButton("登录");
		loginframe.add(this, BorderLayout.WEST);
		loginframe.setSize(WIDTH, HEIGHT);
		//实现居中功能
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		loginframe.setLocation(x, y);
		JButton ok = new JButton("登录");
		JButton cancel = new JButton("放弃");
		//创建标签对象title
		JLabel title = new JLabel("信 息 登 录 窗 口");
		JLabel name = new JLabel("用户名：");
		JLabel password = new JLabel("密  码：");
		//创建用户名和密码输入文本框
		final JTextField nameinput = new JTextField(15); 
		final JPasswordField passwordinput = new JPasswordField(15);
		nameinput.setText("gaya");
		passwordinput.setText("123456");
		//创建网格组布局对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		//设置constraints属性
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 1;
		constraints.weighty = 1;
		//使用网格组布局添加控件
		add(title,constraints,2,0,4,1);
		add(name,constraints,2,1,2,1);
		add(password,constraints,2,2,2,1);
		add(nameinput,constraints,4,1,2,1);
		add(passwordinput,constraints,4,2,2,1);
		add(ok,constraints,3,3,2,1);
		add(cancel,constraints,4,3,2,1);
		loginframe.setResizable(false);
		loginframe.setVisible(true);
		//为ok按钮注册事件
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				//获取用户名输入框中的内容
				String nametext = nameinput.getText();
				//获取密码框中输入的内容
				String passwordtext = passwordinput.getText();
				//创建关于密码的字符串
				String str = new String(passwordtext);
				//判断用户名和密码
				boolean x = (nametext.equals("gaya"));
				boolean y = (str.equals("123456"));
				boolean z = (x&&y);
				if(z==true){
					loginframe.dispose();
					mainframe main = new mainframe();
					System.out.println("登录成功");
				}else if(z==false){
					nameinput.setText("");
					passwordinput.setText("");
				}
			}
		});
		//为cancel注册事件
		cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				loginframe.dispose();
			}
		});
	}
}