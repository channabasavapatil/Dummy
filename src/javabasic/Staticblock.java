package javabasic;

public class Staticblock {
	static {
		System.out.println("running static class b1");
	}

	public static void main(String[] args) {
		System.out.println("started");
		System.out.println("completed");

	}

	static {
		System.out.println("running static b2");

	}

}
