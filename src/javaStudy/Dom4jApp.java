package javaStudy;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jApp {
	public Dom4jApp(){
		
	}
	public static void parseXML(){
		int i=0;
		char j ='a';
		SAXReader parser = new SAXReader();
		try{
			Document doc = parser.read(new File("/Users/gaya/git/javaStudy/src/javaStudy/dept.xml"));
			Element root = doc.getRootElement();
			String rootName = root.getName();
			System.out.println(rootName+"0");
			List<Element> list = root.elements();
			for(Element e:list){
				String eName = e.getName();
				System.out.println(eName);
				List<Attribute> att = e.attributes();
				for(Attribute a:att){
					i++;
					String attName = a.getName();
					String attValue = a.getValue();
					System.out.println(attName+"----"+attValue+" "+i);
				}
				Iterator<Element> iter = e.elementIterator();
				while(iter.hasNext()){
					j++;
					Element child = iter.next();
					String childName = child.getName();
					String childText = child.getText();
					System.out.println(childName+"-----"+childText+j);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		parseXML();
	}
}
