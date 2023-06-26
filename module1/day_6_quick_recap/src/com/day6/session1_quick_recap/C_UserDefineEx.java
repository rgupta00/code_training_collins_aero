package com.day6.session1_quick_recap;

//why compiler suggesting to have serialVersionUID id in my user define ex
//this is related to a topic ie serilization*
class AccountCreationException extends Exception{

	private static final long serialVersionUID = -6581405173716938912L;

	public AccountCreationException(String message) {
		super(message);
	}
	
}
class Account{
	private int id;
	private String name;
	private double balance;
	
	public Account(int id, String name, double balance) throws AccountCreationException{
		this.id = id;
		this.name = name;
		this.balance = balance;
		if(balance<1000)
			throw new AccountCreationException("account can not be created");
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance
				+ "]";
	}
	
	
	
}
public class C_UserDefineEx {
	
	public static void main(String[] args) {
		try{
			Account account=new Account(1, "raj", 1100);
			System.out.println(account);
		}catch(AccountCreationException ex){
			System.out.println(ex.getMessage());
		}
		
	}

}
