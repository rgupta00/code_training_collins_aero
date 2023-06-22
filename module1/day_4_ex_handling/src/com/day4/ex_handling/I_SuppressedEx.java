package com.day4.ex_handling;

//Q: how to get information about suppresed ex if u are not using autoclosable?

class TryEx extends Exception {
}

class FinallyEx extends Exception {
}

public class I_SuppressedEx {

	public static void main(String[] args) {
		// me
		try {
			foo();
		} catch (Exception e) {
			Throwable[] throwables = e.getSuppressed();

			for (Throwable t : throwables) {
				System.out.println(t);
			}

			System.out.println(e);
		}
	}

	// amit
	private static void foo() throws Exception {
		// u need to use a method form ex handing
		// addSuppresed()
		Exception t = null;
		try {
			throw new TryEx();
		} catch (Exception e) {
			t = e;
		} finally {
			FinallyEx ex = new FinallyEx();
			if (t != null) {
				ex.addSuppressed(t);
			}
			throw ex;
		}
	}
}
