import java.util.Scanner;

public class Main {
	
	public static void main(String []o)
	{
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String string1 = string.toLowerCase();
 		String string3 = UserMainCode.getString(string1);
 		System.out.println("result is: "+string3);
	}

}
