package swingStudy;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class swingTest {
	
	public static void main(String[] args) {
		//创建对象frame1
		gridbaglayoutframe frame1 = new gridbaglayoutframe();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	}
}
class gridbaglayoutframe extends JFrame{
	//创建成员变量
	private static final int WIDTH = 500;
	private static final int HEIGHT = 300;
	public gridbaglayoutframe(){
		setTitle("学生管理系统");
		setSize(WIDTH,HEIGHT);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		setLocation(x, y);
		//获取对象con
		Container con = getContentPane();
		//添加对象到con
		con.add(new studentJPanel(), BorderLayout.CENTER);
		con.add(new buttonpanel(), BorderLayout.SOUTH);
	}
}
class studentJPanel extends JPanel{
	public studentJPanel(){
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		JLabel namelabel = new JLabel("姓名");//
		JTextField nameTextField = new JTextField(10);
		JLabel addresslabel = new JLabel("籍贯：");
		JComboBox addressCombo = new JComboBox(new String[]{"江西","四川","山西","河北"});
		//创建简单介绍的标签和文本输入域
		JLabel commentLabel = new JLabel("简单介绍");
		JTextArea sample = new JTextArea();
		sample.setLineWrap(true);
		//创建和设置constraints对象
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 5;
		constraints.weighty = 5;
		//添加对象到constraints对象
		add(namelabel,constraints,0,0,1,1);
		add(nameTextField,constraints,1,0,4,4);
		add(addressCombo,constraints,0,0,1,1);
		add(addresslabel,constraints,0,1,0,0);
		
	}
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}
	
}
class buttonpanel extends JPanel{
	public buttonpanel(){
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		//创建确定和取消按钮
		JButton okbutton = new JButton("确定");
		JButton cancelbutton = new JButton("取消");
		//创建和设置对象hBox
		Box hBox = Box.createHorizontalBox();
		hBox.add(Box.createHorizontalStrut(180));
		hBox.add(okbutton);
		hBox.add(Box.createHorizontalGlue());
		hBox.add(cancelbutton);
		hBox.add(Box.createHorizontalStrut(180));
		add(hBox);
	}
}