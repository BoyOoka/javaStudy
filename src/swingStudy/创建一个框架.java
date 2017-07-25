package swingStudy;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
		//创建文本输入域对象
		JTextField jt = new JTextField(10);
		//创建密码输入域
		JPasswordField jp = new JPasswordField(10);
		//创建文本区对象
		JTextArea ja = new JTextArea(5,5);
		ja.setText("什么鬼");
		ja.setColumns(10);
		ja.setRows(5);
		ja.setLineWrap(true);
		ja.setWrapStyleWord(true);
		ja.setTabSize(20);
		//创建标签对象
		JLabel jl = new JLabel("学生管理",JLabel.CENTER);
		//创建字符串对象
		String[] a = {"小明","小花","小小花","小小明"};
		JComboBox<Object> jc = new JComboBox<Object>(a);
		//创建菜单栏条对象menubar1
		JMenuBar menubar1 = new JMenuBar();
		jf.setJMenuBar(menubar1);//设置窗口对象jf的菜单栏
		//创建4个菜单对象
		JMenu menu1 = new JMenu("文件");
		JMenu menu2 = new JMenu("编辑");
		JMenu menu3 = new JMenu("视图");
		JMenu menu4 = new JMenu("帮助");
		//将菜单栏添加到工具栏对象
		menubar1.add(menu1);
		menubar1.add(menu2);
		menubar1.add(menu3);
		menubar1.add(menu4);
		//创建4个菜单项对象
		JMenuItem item1 = new JMenuItem("打开");
		JMenuItem item2 = new JMenuItem("保存");
		JMenuItem item3 = new JMenuItem("打印");
		JMenuItem item4 = new JMenuItem("退出");
		//添加菜单项到菜单栏
		menu1.add(item1);
		menu1.add(item2);
		menu1.addSeparator();//添加间隔条
		menu1.add(item3);
		menu1.addSeparator();
		menu1.add(item4);
		//将按钮添加到面板p
		Panel p = new Panel();
		Panel p1 = new Panel();
		p.add(jr1);
		p.add(jr2);
		p.add(jr3);
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		p.add(jt1);
		p.add(jt);
		p.add(jp);
		p.add(ja);
		p.add(jl);
		p.add(jc);
		p1.add(b1);
		p1.add(b2);
		jf.add(p,BorderLayout.CENTER);//将对象添加到窗口
		jf.add(p1, BorderLayout.PAGE_END);
//		jf.show();
		jf.setVisible(true);
//		JOptionPane.showConfirmDialog(null, "这是错误信息！","这是错误信息",JOptionPane.YES_NO_CANCEL_OPTION);
	}

}
