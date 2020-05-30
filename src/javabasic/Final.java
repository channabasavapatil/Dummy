package javabasic;

public class Final {

}
class S{
	final void test(){
		System.out.println("inside func1");
	}
}
class T extends S {
	void test1(){
		System.out.println("inside func2");
	}
	
}
