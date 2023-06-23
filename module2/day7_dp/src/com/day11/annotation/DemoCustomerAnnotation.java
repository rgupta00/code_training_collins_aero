package com.day11.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//can we write our own custom annotation + java reflection
//if u want to process an annotation using java relection then it should be visible to JVM ie we should go for 
//max scope RUNTIME
//1. create the annotation
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	public boolean isDone() default false;
	public String message() default "";
}

//2. apply the annotation
class MyClass{
	@MyAnnotation(isDone = true, message = "training is going on..for yms")
	public  void foofMethod() {
		System.out.println("foofMethod...");
	}
}
//3. we have to process it: java reflection api

public class DemoCustomerAnnotation {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> clazz=Class.forName("com.day11.annotation.MyClass");
		Method []methods=clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			//kiya method tum per ye annotation laga hey
			
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				//ager hey to do
				MyAnnotation annotation=method.getAnnotation(MyAnnotation.class);
				
				System.out.println(annotation.message());
				System.out.println(annotation.isDone());
				
			}
		}
	}
}





