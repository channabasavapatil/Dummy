package javabasic;

public class Abstractex {

	public static void main(String[] args) {
		Z obj = new Z();
		obj.show();
		obj.show1();
	}

}

interface a1 {
	void show();
}

interface x1 extends a1 {
	void show1();

}

class Z implements x1 {

	@Override
	public void show() {
		System.out.println("implemented show method");

	}

	@Override
	public void show1() {
		System.out.println("implemented show1 method");

	}

}