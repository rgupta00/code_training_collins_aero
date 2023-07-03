package com.basic.ser1;

import java.io.Serializable;

public class Account implements Serializable{
	private static final long serialVersionUID = 6935269591828463443L;
	
	int id;
     String name;
     double salary;
     String accType;
    
     static  String bankName="SBI";// staitc varaible dont particapte in the Ser....

    public Account(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
