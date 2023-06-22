package com.day4.ex_handling;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class MyResouce implements AutoCloseable {
	public MyResouce() {
		System.out.println("ctr of MyResouce");
	}

	public void useResource() {
		System.out.println("using resources");
		throw new ArithmeticException();
	}

	@Override
	public void close() throws Exception {
		System.out.println("close is called");
		throw new NullPointerException();
	}

}

public class H_AutomaticResourceMgt {
	public static void main(String[] args) {

		// How ARM works? Java 1.7
		// if any class implements AutoCloseable interface then java give
		// gurantee to
		// close the resouce as soon as variable goes out of the scope?

		// Suppressed Exception in java?
		// Fever -- crocine --> suppress the fever

		// right now NullPointerException was suppresed ?
		// how to get inforation about this exception

		try (MyResouce myResouce = new MyResouce()) {
			myResouce.useResource();
		} catch (Exception e) {
			
			//how to get inforation about suppresed ex
			Throwable[] throwables = e.getSuppressed();
			for (Throwable throwable : throwables) {
				System.out.println(throwable);
			}
			System.out.println(e);
		}

		/*
		 * //now u dont have to close the resouces , it is automatically close
		 * 
		 * try (Scanner scanner = new Scanner(System.in)) {
		 * System.out.println("PE ur name"); String name = scanner.nextLine();
		 * System.out.println(name); }
		 */

		// Automatic resouce managemnt java 7
		// ========================================
		// kab lagaga? ARM can be applied to a class iff it
		// extends a class ie called AutoClosbable

	}
}
