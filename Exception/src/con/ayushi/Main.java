package con.ayushi;

public class Main {
	
	public static void main(String []r) throws NumberException
	{
		int i =8;
		int j =9;
		try
		{
			
		int k =i/j;
		
		if(k==0)
		throw new NumberException("Alert! Number can not divided by zero");
		System.out.println("result is "+k);
		}
		catch(NumberException e)
		{
			System.out.println("error "+ e.getMessage());
		}
		finally {
			System.out.println("IN FINALLY");
		}
		
	}

}
