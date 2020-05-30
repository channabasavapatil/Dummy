package javabasic;

public class Abstractex1 {
	public static void main(String[] args) {
		M obj = new M();
		obj.test();
		obj.test2();
		
	}

}

class M extends N{
	void test(){
		System.out.println("inside func1");
	}

	@Override
	void test2() {
		System.out.println("implemented abstract method");
		
	}
		
			
}
abstract class N {
	void test1(){
		System.out.println("inside func2");
	
		
	}
	abstract void test2();
}
