package day_1.objectorientation;

//Employee Ashok
class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int myId, String myName, double mySalary){
		id=myId;
		name=myName;
		salary=mySalary;
	}
	
	public void increment(double increment){
		salary+=increment;
	}
	public void printEmployee(){
		System.out.println("emp state is : "+ id +" name "+ salary);
	}
}

public class B_DataHiding {
	
	//Me
	public static void main(String[] args) {
		Employee employee=new Employee(1,"raj",670000);
		
		employee.printEmployee();
		employee.increment(20000);
		employee.printEmployee();
		
		
	}

}
