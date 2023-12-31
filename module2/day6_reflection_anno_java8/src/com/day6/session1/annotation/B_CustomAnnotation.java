package com.day6.session1.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * java custom annotation used by various fraemwroks
 */

//step 1: write a custom annotion 

@Target({ElementType.METHOD, ElementType.TYPE})// where to apply this annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	public String hello() default "hello";
}


class Foof{
	

	//step 2: apply this annottaion somewhere 

	@MyAnno(hello="all java champs")
	public void foof(){
		System.out.println("hello to foof method");
	}
}
public class B_CustomAnnotation {
	
	public static void main(String[] args) {
		
		//step 3: process that annotation using java reflection core java:
		//it is used by various framework to know about meta data of ur class
		Foof f=new Foof();
		f.foof();
	}

}
