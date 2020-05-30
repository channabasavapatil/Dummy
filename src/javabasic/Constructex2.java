package javabasic;

public class Constructex2 {

	double d = 10.24;

	Constructex2() {
		System.out.println("inside constructor");
		d = 5000.000;

	}

}

class run2 {

	public static void main(String[] args) {

		Constructex2 obj = new Constructex2();
		System.out.println("d=" + obj.d);
	}

}
