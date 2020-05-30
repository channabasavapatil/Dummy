package javabasic;

public class abstractex3 {
	public static void main(String[] args) {
		c1 obj = new c1();
		obj.display();
		obj.display1();
		
	}

}

interface b1{
	void display();
}
interface b2{
	void display1();
}
class c1 implements b1,b2{

	@Override
	public void display1() {
		System.out.println("implemented display1");
		
	}

	@Override
	public void display() {
		System.out.println("implemented display2");
		
	}
	
}
