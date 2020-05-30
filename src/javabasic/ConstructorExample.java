package javabasic;

public class ConstructorExample {
	
	public static void main(String[] args) {
		StudentData st= new StudentData(25, "sangu", "xyz");
		System.out.println("Before method ");
		st.display();
		st = new StudentData(45, "amar");
		st.display();
	}

}

class StudentData {
	
	int rollNumber;
	String sName;
	String schoolName;
	
	public StudentData(int rollNumber, String sName, String schoolName) {
		this(25,"rutu");
		System.out.println("Calling cons");
		this.rollNumber = rollNumber;
		this.sName = sName;
		this.schoolName = schoolName;
	}
	
	public StudentData(int rollNumber, String sName) {
		this(25);
		System.out.println("Calling cons 2 parameter");
		this.rollNumber = rollNumber;
		this.sName = sName;
	}
	
	public StudentData(int rollNumber) {
		System.out.println("Calling cons 2 parameter");
		this.rollNumber = rollNumber;
		this.sName = sName;
	}
	
	public void display(){
		System.out.println(this.rollNumber);
	}
	
	
}
