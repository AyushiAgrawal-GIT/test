public class UserMainCode {

	public static String getString(String s) {

		StringBuffer b = new StringBuffer();

		if (s.charAt(0) != 'j' && s.charAt(1) != 'b') {
			b.append(s.substring(2));
		} else if (s.charAt(0) == 'j' && s.charAt(1) == 'b') {
			b.append(s);
		} else if (s.charAt(0) != 'j' && s.charAt(1) == 'b') {
			b.append(s.substring(1));
		} else if (s.charAt(0) == 'j' && s.charAt(1) != 'b') {
			b.append(s.substring(0, 1)).append(s.substring(2));
		}
		return b.toString();

	}
}
