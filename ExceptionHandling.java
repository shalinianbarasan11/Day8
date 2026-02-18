//2. Write a program for handling exception
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			  int a = 7;
			  int b =0;
			  int c = a%b;
			  System.out.println(c);
			  int[] num = {11, 7, 3, 6};
		      System.out.println(num[6]);
		}catch(ArithmeticException e) {
			System.out.println("Checking: % can't divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Checking: Array out of index");
		}
		System.out.println("***Exception handling***");
	}

}
