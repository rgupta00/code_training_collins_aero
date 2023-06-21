package com.salaryprocesingsystem;
//raised by a consultant..
public class Invoice implements Payable {
	
	private String regNo;
	private String vendorName;
	private int ratePerDay;
	private int noOfDay;
	private String invoiceNumber;

	public Invoice(String regNo, String vendorName, int ratePerDay,
			int noOfDay, String invoiceNumber) {
		this.regNo = regNo;
		this.vendorName = vendorName;
		this.ratePerDay = ratePerDay;
		this.noOfDay = noOfDay;
		this.invoiceNumber = invoiceNumber;
	}
	
	public void printDetails(){
		System.out.println("regNo: "+ regNo);
		System.out.println("vendorName: "+ vendorName);
		System.out.println("ratePerDay: "+ ratePerDay);
		System.out.println("noOfDay: "+ noOfDay);
		System.out.println("invoiceNumber: "+ invoiceNumber);
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public int getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(int ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public int getNoOfDay() {
		return noOfDay;
	}
	public void setNoOfDay(int noOfDay) {
		this.noOfDay = noOfDay;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Override
	public double getPay() {
		return noOfDay*ratePerDay*.7;
	}
	
	

}
