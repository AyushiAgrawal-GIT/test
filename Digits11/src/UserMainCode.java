
public class UserMainCode {

	public static Integer getDigitSum(Integer n) {
		int sum = 0, sum1 = 0;
		while(n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		} 
		if(sum<9)
		{
			return sum;
		}
		
		else {
			while (sum != 0) {
				int rem1 = sum % 10;
				sum1 = sum1 + rem1;
				sum = sum / 10;
			}
		}
		return sum1;
	}
}
