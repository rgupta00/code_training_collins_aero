package com.demo;

public class Demo {

	public static void main(String[] args) {
		//you are doing this di manually ;(
		//is it possible if some framework is there who can do this me
		
		//Spring framework can do this for you==> IOC container
		
		Car car =new Car();
		
		car.setEngine(new TurboEngine());
		car.setTyre(new MrfTyre());
		
		car.drive();
	}
}
