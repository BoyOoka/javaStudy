package schoolSystem;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class studentinfo extends JPanel{
	//创建各种成员变量
	static final int WIDTH = 800;
	static final int HEGHTI = 500;
	//创建各种组件
	JComboBox<String> nameinput=null;
	JTextField codeinput=null;
	JTextField sexyinput=null;
	JTextField birthdayinput=null;
	JTextField ageinput=null;
	JTextField addressinput=null;
	JTextField gradeinput=null;
	JTextField majorinput=null;
	//创建顶层框架
	JFrame studentinforframe;
	storesystem store = new storesystem();
	Connection con = store.getConnection();
//	addframe af =new addframe();
	//添加方法
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c,constraints);
	}
	public studentinfo(String str,String sql,final String major1){
		studentinforframe = new JFrame();
		studentinforframe.setTitle(str);
		//设置关闭方法
//		studentinforframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentinforframe.setSize(WIDTH,HEGHTI);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width-WIDTH)/2;
		int y = (height-HEGHTI)/2;
		studentinforframe.add(this,BorderLayout.CENTER);
		studentinforframe.setLocation(x, y);
		studentinforframe.setVisible(true);
		GridBagLayout lay = new GridBagLayout();//创建布局管理器
		setLayout(lay);
		//创建标签对象
		JLabel name = new JLabel("姓名");
		JLabel code = new JLabel("学号");
		JLabel sexy = new JLabel("性别");
		JLabel age = new JLabel("年龄");
		JLabel birthday = new JLabel("出生年月");
		JLabel address = new JLabel("家庭住址");
		JLabel grade = new JLabel("班级");
		JLabel major = new JLabel("专业");
		JLabel title = new JLabel(str);
		//组件对象
		nameinput = new JComboBox<String>();
		codeinput = new JTextField(10);
		sexyinput = new JTextField(10);
		birthdayinput = new JTextField(10);
		ageinput = new JTextField(10);
		addressinput = new JTextField(10);
		gradeinput = new JTextField(10);
		majorinput = new JTextField(10);
		//获取容器对象
		Vector<student> vec = store.getstudent(con, sql);
		//提取Vector中的数据，赋值给学生对象
		for(int i=0;i<vec.size();i++){
			student one = (student) vec.get(i);
			String nameselect = one.getname();
			nameinput.addItem(nameselect);
		}
		//获取输入文本框中的内容
		String namestring = (String) nameinput.getSelectedItem();
		student p = store.getobject(con, namestring,major1);
		String inputcode = p.getcode();
		String inputsexy = p.getsexy();
		String inputbirthday = p.getbirthday();
		String inputgrade = p.getgrade();
		String inputaddress = p.getaddress();
		String inputage = p.getage();
		String inputmajor = p.getmajor();
		//创建各种组件内容
		codeinput.setText(inputcode);
		sexyinput.setText(inputsexy);
		birthdayinput.setText(inputbirthday);
		ageinput.setText(inputage);
		addressinput.setText(inputaddress);
		gradeinput.setText(inputgrade);
		majorinput.setText(inputmajor);
		//创建四个按钮
		JButton addition = new JButton("添加");
		JButton delete = new JButton("删除");
		JButton update = new JButton("更新");
		JButton bereturn = new JButton("返回");
		//设置布局对象器
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.weightx = 4;
		constraints.weighty = 6;
		add(title,constraints,0,0,4,1);
		add(name,constraints,0,1,1,1);
		add(code,constraints,0,2,1,1);
		add(sexy,constraints,0,3,1,1);
		add(age,constraints,0,4,1,1);
		add(nameinput,constraints,1,1,1,1);
		add(codeinput,constraints,1,2,1,1);
		add(sexyinput,constraints,1,3,1,1);
		add(ageinput,constraints,1,4,1,1);
		
		add(birthday,constraints,2,1,1,1);
		add(address,constraints,2,2,1,1);
		add(grade,constraints,2,3,1,1);
		add(major,constraints,2,4,1,1);
		add(birthdayinput,constraints,3,1,1,1);
		add(addressinput,constraints,3,2,1,1);
		add(gradeinput,constraints,3,3,1,1);
		add(majorinput,constraints,3,4,1,1);
		
		add(addition,constraints,0,5,1,1);
		add(delete,constraints,1,5,1,1);
		add(update,constraints,2,5,1,1);
		add(bereturn,constraints,3,5,1,1);
		//通过每单击名字显示名字的所有信息
		nameinput.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
					String namestring  = (String) nameinput.getSelectedItem();
					student p = store.getobject(con, namestring,major1);
					String inputcode = p.getcode();
					String inputsexy = p.getsexy();
					String inputbirthday = p.getbirthday();
					String inputgrade = p.getgrade();
					String inputaddress = p.getaddress();
					String inputage = p.getage();
					String inputmajor = p.getmajor();
					codeinput.setText(inputcode);
					sexyinput.setText(inputsexy);
					birthdayinput.setText(inputbirthday);
					ageinput.setText(inputage);
					addressinput.setText(inputaddress);
					gradeinput.setText(inputgrade);
					majorinput.setText(inputmajor);
			}
			
		});
			
	}
}
