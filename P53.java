/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P53		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		double num = 1;
		double den = 3;
		double sum = 1;
		int sign = 1;
		for (int i = 0; i < 10000; i++)
		{
		sum = sum - (num*sign)/den;
		den = den + 2;
		sign = sign * -1;
		}
   IBIO.output("Pi is " + 4*sum);
	}
}


/*

Pi is 3.1416926435905346

*/
