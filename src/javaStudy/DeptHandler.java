package javaStudy;

import java.io.File;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class DeptHandler extends DefaultHandler{
	public DeptHandler(){
		
	}
	public void startDocument() throws SAXException{
		System.out.println("开始解析XML");
	}
	//拦截是否解析xml文档中某个元素的开始标记
	public void startElement(String uri,String localName,String qName,Attributes attributes) throws SAXException{
		System.out.println("uri:"+uri);
		System.out.println("localName:"+localName);
		System.out.println("qName:"+qName);
		System.out.println("attributes:"+attributes);
		if(attributes.getLength()>0){
			for(int i=0;i<attributes.getLength();i++){
				String AttName = attributes.getQName(i);
				String AttValue = attributes.getValue(i);
				System.out.println(AttName+"----"+AttValue);
			}
		}
	}
	//拦截是否解析XML文档中某个元素的开始标记和结束标记中间的内容
	public void charcters(char[] ch,int start,int length)throws SAXException{
		System.out.println("==="+new String(ch)+"===");
		System.out.println(new String(ch,start,length));
		
	}
	//拦截是否解析XML文档中某个元素的结束标记
	public void endElement(String uri,String localName,String qName)throws SAXException{
		System.out.println("uri:"+uri);
		System.out.println("localName:"+localName);
		System.out.println("qName:"+qName);
	}
	public void endDocument() throws SAXException{
		System.out.println("结束解析XML文档");
	}
	public static void main(String[] args) {
		try{
			//通过工厂生成一个解析器
			XMLReader parser = XMLReaderFactory.createXMLReader();
			//给该解释器设定句柄
			parser.setContentHandler(new DeptHandler());
			File f1 = new File("");
			String path = f1.getAbsolutePath();
			parser.parse(new InputSource(path+"/src/javaStudy/dept.xml"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
class Dept{
	private Integer deptid;
	private String deptname;
	private Integer deptnum;
	private String deptdesc;
	public Dept(){
		
	}
	public String toString(){
		return this.deptid+"---"+this.deptname+"---"+this.deptnum+"---"+this.deptdesc+"---";
	}
	
}
