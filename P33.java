/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P33		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int sum = 0;
		int n   = IBIO.inputInt("Enter a number: ");
		do
		{
			int digit = n % 10;
			sum = sum + (digit * digit * digit);
			n = n / 10;
		} while ( n != 0);
		IBIO.output("The sum of the cube of the digits of the number is " + sum);
	}
}


/*

Enter a number: 345
The sum of the cube of the digits of the number is 216

*/
