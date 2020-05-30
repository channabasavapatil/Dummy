package javabasic;

public class Nonstatic {
	{
		System.out.println("b1 started execution");
	}
	
public static void main(String[] args) {
	
	Nonstatic obj = new Nonstatic();
	System.out.println("started");
	Nonstatic obj1 = new Nonstatic();
	System.out.println("completed");
	
}
{
	System.out.println("b2 started execution");
}
}
