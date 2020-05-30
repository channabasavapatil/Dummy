package javabasic;

public class OverloadingEx2 {

	public static void main(String[] args) {
		xyz obj = new xyz();
		obj.test(200000);
		obj.test(200);
	}

}

class abc {
	void test() {
		System.out.println("running test func");
	}

}

class xyz extends abc {
	void test(int a) {
		System.out.println("running (int) test func");
	}
}