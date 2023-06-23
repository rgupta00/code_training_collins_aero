package com.day11.session2.mcq.q2;

import java.util.*;

class Emp {
	int id;

	public Emp(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Emp other = (Emp) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
//	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=").append(id).append("]");
		return builder.toString();
	}

}

public class Demo {

	public static void main(String[] args) {
		Set<Emp> emps = new HashSet<>();
		emps.add(new Emp(12));
		System.out.println(emps.contains(new Emp(12)));

	}
}
