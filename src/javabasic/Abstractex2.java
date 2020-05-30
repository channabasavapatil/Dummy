package javabasic;

public class Abstractex2 {
	public static void main(String[] args) {
		E obj = new E();
		obj.test1();
		obj.test2();

	}

}

abstract class F {
	abstract void test1();

	abstract void test2();

}

class E extends F {

	@Override
	void test1() {
		System.out.println("implmented test1 method");

	}

	@Override
	void test2() {
		System.out.println("implmented test2 method");

	}

}
