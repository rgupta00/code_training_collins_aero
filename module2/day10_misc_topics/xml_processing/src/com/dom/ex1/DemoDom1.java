package com.dom.ex1;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class DemoDom1 {

	public static void main(String[] args)throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.newDocument();

		// Creating elements
		Element rootEle = document.createElement("students");
		Element studentEle = document.createElement("student");
		Element nameEle = document.createElement("name");
		Element emailEle = document.createElement("email");
		Element mobileEle = document.createElement("mobile");
		Element addressEle = document.createElement("address");
		// Creating text infomration to store
		Text t1 = document.createTextNode("raja");
		Text t2 = document.createTextNode("raja@raja.com");
		Text t3 = document.createTextNode("434343434");
		Text t4 = document.createTextNode("noida");

		nameEle.appendChild(t1);
		emailEle.appendChild(t1);
		mobileEle.appendChild(t1);
		addressEle.appendChild(t1);

		studentEle.appendChild(nameEle);
		studentEle.appendChild(emailEle);
		studentEle.appendChild(mobileEle);
		studentEle.appendChild(addressEle);

		rootEle.appendChild(studentEle);
		
		document.appendChild(rootEle);
		
		Transformer t = TransformerFactory.newInstance().newTransformer();

		t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("students.xml")));

		System.out.println("xml file generated...");
	}

}
