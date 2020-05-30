package javabasic;

public class Interfaceexample1 {
	public static void main(String[] args) {

		Y obj = new Y();
		obj.test();

	}
}

interface I {
	void test();

}

class Y implements I {
	public void test() {
		System.out.println("implemented interface I");
	}
}
