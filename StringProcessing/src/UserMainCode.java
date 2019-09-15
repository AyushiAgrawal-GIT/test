
public class UserMainCode {

	public static boolean isEqual(int i, String s1, String s2) {
		Boolean b = false;
		Character c1 = s1.charAt(i-1);
		System.out.println("C1 IS: "+c1);
		StringBuffer sb = new StringBuffer(s2);
		String s3 = sb.reverse().toString();
		Character c2 = s3.charAt(i-1);
		
		//String s= String.valueOf(s1.charAt(i-1));
		System.out.println("C2 IS: "+c2);
		if(c1.equals(c2))
		{
			b = true;
			return b;
		}

		return b;

	}

}
