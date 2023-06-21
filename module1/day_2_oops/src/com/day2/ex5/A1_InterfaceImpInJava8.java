package com.day2.ex5;


//now some imp is done inside interface concept
interface Z{
	int i=0;
	public void fooZ();
	
	//now u an have default imp of the method , why
	default public void fooDefault(){
		System.out.println("fooDefault method inside Z interface");
	}
	//now u can also add static method inside the interface
	public static void fooStatic(){
		System.out.println("fooStatic");
	}
}
class ZImpl implements Z{

	@Override
	public void fooZ() {
		System.out.println("fooZ method is overriden");
	}
	
}
public class A1_InterfaceImpInJava8 {
	
	public static void main(String[] args) {
		Z z=new ZImpl();
		z.fooZ();
		Z.fooStatic();
	}

}
