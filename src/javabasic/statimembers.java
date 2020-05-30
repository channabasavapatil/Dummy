package javabasic;

public class statimembers {
	static int i = 0; // intialize variables using static keyword
	static double d = 0.0;
	int m = 10;
	int n = 20;

	public static void main(String[] args) {
		statimembers.dispay();// calling func
		i = 20000;
		d = 4000.000000;
		statimembers.dispay();

		statictest.j = 1000000; // acceing variable statictest.j =1000000; is
								// needed oly if we are accesimg objects from
								// diff class..(not in same class)
		//Acessing normal method by creating object 
		statimembers obj = new statimembers();
		
	}

	static void dispay() {
		System.out.println("i" + i);
		System.out.println("d" + d);
	}

	public void show() {
		int c = m + n;
		System.out.println("m " + m);
		System.out.println("n " + n);
		System.out.println("c " + c);
	}
}

	
	
	class statictest{
		static int j = 0;    
		static double k= 0.0;
	}
	
	
		
	
	
	


