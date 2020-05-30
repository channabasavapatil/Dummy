package javabasic;

public class Inheritance {
	public static void main(String[] args) {

		A obj = new A();

		System.out.println("i = " + obj.i);

		System.out.println(("d =" + obj.d));
		B obj1 = new B();
		System.out.println("j = " +  obj1.j);
		System.out.println("f =" + obj1.f);
		System.out.println("i = " + obj1.i);
		System.out.println("d=" +obj1.d);


	}

}

class A {
	int i = 100;
	double d = 200.22;

}

class B extends A {

	int j = 400;
	float f = 20;

}
