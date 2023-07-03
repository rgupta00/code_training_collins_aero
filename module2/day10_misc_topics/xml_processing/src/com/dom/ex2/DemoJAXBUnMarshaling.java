package com.dom.ex2;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class DemoJAXBUnMarshaling {
	
	public static void main(String[] args) throws Exception {
		ZooInfo zoo=null;
		
		JAXBContext context=JAXBContext.newInstance(ZooInfo.class);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		
		zoo=(ZooInfo) unmarshaller.unmarshal(new File("data.xml"));
		
		System.out.println(zoo);
	//	marshaller.marshal(zoo, System.out);
	
	}

}
