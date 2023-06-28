package com.day11.dp.creational.prototype;

import java.util.Date;

class Employee implements Cloneable {
	private int id;
	private String name;
	private Date hireDay;//mutable
	
	public Employee(int id, String name, Date hireDay) {

		this.id = id;
		this.name = name;
		this.hireDay = hireDay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDay() {
		return hireDay;
	}
	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", hireDay=").append(hireDay)
				.append("]");
		return builder.toString();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee clonedObject= (Employee) super.clone();// by default => shallow copy
		clonedObject.hireDay= (Date) hireDay.clone();
		return clonedObject;
	}
	
	
	
}
public class DemoPrototype {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date();
		
		Employee employee1 = new Employee(33, "raja", date);
		
		Employee employee2 = (Employee) employee1.clone();
	
		System.out.println("-----before changing-------");
		System.out.println(employee1);
		System.out.println(employee2);
		
		System.out.println("After changing............");
		employee1.getHireDay().setDate(26);
		employee1.setName("amit");
		
		System.out.println(employee1);
		System.out.println(employee2);
	}

}
