import java.util.Scanner;

public class Main {

	public static void main(String o[])
	{
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer i = UserMainCode.getDigitSum(n);
		System.out.println("single digit sum is: "+i);
		
		
	}

}
