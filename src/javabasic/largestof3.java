package javabasic;

public class largestof3 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		int num3 = 100;

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is larger" + num1);

		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is larger" + num2);

		} else if (num3 > num1 && num3 > num2) {

			System.out.println("num3 is larger" + num3);

		} else {
			System.out.println("all are equal");
		}

	}

}
