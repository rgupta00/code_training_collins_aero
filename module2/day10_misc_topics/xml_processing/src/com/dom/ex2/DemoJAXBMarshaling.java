package com.dom.ex2;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class DemoJAXBMarshaling {
	
	public static void main(String[] args) throws Exception {
		ZooInfo zoo=new ZooInfo("banargatta", 201);
		
		JAXBContext context=JAXBContext.newInstance(ZooInfo.class);
		
		Marshaller marshaller=context.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(zoo, new FileOutputStream(new File("data.xml")));
		
		
	//	marshaller.marshal(zoo, System.out);
	
	}

}
