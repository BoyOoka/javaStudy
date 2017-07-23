package javaStudy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class 创建XML {
	public static void createXMl(){
		DocumentFactory f = new DocumentFactory();
		Document doc = f.createDocument();
		doc.addComment("人的信息xml文件");
		//设置根元素
		Element root = doc.addElement("peoples");
		//设置第一个子元素
		Element p1 = root.addElement("person");
		p1.addAttribute("pid", "1");
		p1.addComment("第一个人");
		//设置孙元素
		Element pnameEle = p1.addElement("pname");
		pnameEle.setText("小明");
		Element psexEle = p1.addElement("psex");
		psexEle.setText("男");
		Element pageEle = p1.addElement("page");
		pageEle.setText("20");
		Element phoneEle = p1.addElement("phone");
		phoneEle.setText("1234567890");
		//设置第二个子元素
		Element p2 = root.addElement("person");
		p2.addAttribute("pid", "2");
		p2.addComment("第二个人");
		//设置孙元素
		Element pnameEle1 = p2.addElement("pname");
		pnameEle1.setText("小花");
		Element psexEle1 = p2.addElement("psex");
		psexEle1.setText("女");
		Element pageEle1 = p2.addElement("page");
		pageEle1.setText("20");
		Element phoneEle1 = p2.addElement("phone");
		phoneEle1.setText("1234567890");
		//设置第三个子元素
		Element p3 = p2.createCopy();//通过2复制设置3
		p3.addComment("第三个人");
		p3.attribute("pid").setValue("3");//修改属性
		p3.element("pname").setText("李四");
		root.add(p3);//添加到根元素里
		try{
			//把document进行输入的格式
			OutputFormat format = new OutputFormat();
			format.setEncoding("utf-8");
			format.setIndent(true);//输入是否缩进
			format.setIndentSize(3);
//			format.setIndent("  ");//输入缩进距离
			format.setNewlines(true);
			format.setSuppressDeclaration(true);
			File f1 = new File("");
			String path = f1.getAbsolutePath();
			OutputStream os = new FileOutputStream(path+"/src/javaStudy/peoples.xml");
			XMLWriter writer = new XMLWriter(os,format);
			writer.write(doc);
			writer.close();
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		createXMl();
		System.out.println("xml创建成功");
	}

}
