package javabasic;

public class OverloadingEx1 {
	public static void main(String[] args) {
		X obj = new X();
		obj.test();
		obj.test(10);
		obj.test(200);
	}
	

}
class X {
	void test(){
		System.out.println("runing func1");
	}
	void test(int a) {
		System.out.println("inside func2");
		
	}
	void test(double a){
		System.out.println("inside func3");
	}
}
