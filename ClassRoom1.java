package week1.day1;

public class ClassRoom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 21;
		if (num % 3 == 0) {

			System.out.println("TRIFF");
		} if (num % 5 == 0) {
			System.out.println("FIZZ");

		} if (num % 3 == 0 && num % 5 == 0) {

			System.out.println("TRIFF and FIZZ");
		}else {
			 
			System.out.println("Num not divisable by 3 and 5");
		}
	}

}
