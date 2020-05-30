package javabasic;

public class Empdetails {

	static String compname = "tektronix";
	 int empid;
	 double empsalary;

	void displayemp() {
		System.out.println(empid +"     "+  empsalary);

	}

	public static void main(String[] args) {

		System.out.println("emp of " + compname);
		System.out.println("empid  \t empsalary");
		Empdetails obj = new Empdetails();
		obj.empid = 12072444;
		obj.empsalary = 8088888.444;
		obj.displayemp();

		Empdetails obj1 = new Empdetails();
		obj1.empid = 12072444;
		obj1.empsalary = 8088888.444;
		obj1.displayemp();

	}

}
