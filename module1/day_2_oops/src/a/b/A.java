package a.b;

public class A {
	private int i=1;
	int m=30;
	protected int j=2;
	public int k=3;
	
	private void fooPrivate(){
		System.out.println("foo private method ");
	}
	
	 void fooDefault(){
		System.out.println("foo default method ");
	}
	
	protected void fooProtected(){
		System.out.println("foo protected method ");
	}
	
	public void fooPublic(){
		System.out.println("foo public method ");
	}
	
}
