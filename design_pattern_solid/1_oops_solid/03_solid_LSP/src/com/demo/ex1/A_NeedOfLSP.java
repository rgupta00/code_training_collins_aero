package com.demo.ex1;
//LSP

class FallIllEx extends RuntimeException{
	
}

class DaudIbrahim{
	
	public void shootAnyBody(){
		System.out.println("i just kill for fun ...");
	}
	
	public void briveToHigherAuthority(){
		System.out.println("brive To Higher Authority..");
	}
	
	
	public String superRich(){
		  return  "I enjoy on cost of other ha ha :).";
	}
	
}

class DaudIbrahimSon {
	private DaudIbrahim daudIbrahim;

	public DaudIbrahimSon() {
		daudIbrahim=new DaudIbrahim();
	}

	public String superRich(){
		return "being son of Daud "+daudIbrahim.superRich();
	}
}

public class A_NeedOfLSP {
	
	public static void main(String[] args) {
		DaudIbrahimSon daudIbrahimSon=new DaudIbrahimSon();
		System.out.println(daudIbrahimSon.superRich());
		
	}

}
