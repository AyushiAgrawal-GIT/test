import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String a[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		int i = UserMainCode.validateColorCode(string);

		if (i == 1)
			System.out.println("VALID");
		else
			System.out.println("INVALID");

	}

}
