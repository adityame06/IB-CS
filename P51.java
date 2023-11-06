/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P51		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		double term = 1;
		double sum = 0;
		for (int i = 0; i < 100; i++)
		{
		term = term / 5;
		sum = sum + term;
		}
   IBIO.output("total is " + sum);
	}
}


/*

total is 0.2500000000000001

*/
