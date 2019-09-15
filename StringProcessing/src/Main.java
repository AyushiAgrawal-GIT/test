import java.util.Scanner;

public class Main {
	public static void main(String []k)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose position");
		int n = sc.nextInt();
		System.out.println("1st STRING: ");
		String s1 = sc.next();
		System.out.println("2nd STRING: ");
		String s2 = sc.next();
		
		Boolean b = UserMainCode.isEqual(n, s1, s2);
		System.out.println(b);
		sc.close();
				
	}

}
