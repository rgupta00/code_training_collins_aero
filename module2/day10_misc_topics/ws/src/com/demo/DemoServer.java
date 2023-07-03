package com.demo;

import javax.xml.ws.Endpoint;

public class DemoServer {
	
	public static void main(String[] args) {
		Cal cal=new Cal();
		Endpoint.publish("http://localhost:8090/", new Cal());
		System.out.println("-----------------");
	}

}
