package javabasic;

public class abstractex4 {
	public static void main(String[] args) {
		e1 obj = new e1();
		obj.test();
		obj.test1();
	}

}

interface cinterface{
	void test();
}

class d1 {
	void test1() {
		System.out.println("implemneted in class c1");
	}

}

class e1 extends d1 implements cinterface {

	@Override
	public void test() {
		System.out.println("implemented in class e1");

	}

	public void test1() {
		System.out.println("implemented test1 in class e1");
	}

}