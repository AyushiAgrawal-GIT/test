
public class UserMainCode {

	public static int validateColorCode(String s) {

		int i = -1;
		if (s.matches("[#]{1}[a-zA-Z0-9_]{6,100}")) {
			i = 1;
		} else {
			i = -1;
		}
		return i;
	}
}
