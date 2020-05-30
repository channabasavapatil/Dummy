package javabasic;

public class Overiddingex1 {

	public static void main(String[] args) {
		D obj = new D();
		obj.test();
		C obj1 = new C();
		obj1.test();

	}

}

class C {
	void test() {
		System.out.println("inside func1");
	}
}

class D extends C {
	void test() {
		System.out.println("inside func2");
	}
}