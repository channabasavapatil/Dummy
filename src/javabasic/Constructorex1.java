package javabasic;

public class Constructorex1 {
	double d = 10.9;
	
	Constructorex1(){
		System.out.println("running const");
		d = 100.00;
	}
	
	public static void main(String[] args) {
		Constructorex1 obj = new Constructorex1();
		System.out.println("d=" +obj.d);

	
}

class Run1 {
		void show()
		{
			System.out.println();
			
		}
		
	}
	
	
}
