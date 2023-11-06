/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P52		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		double num = 1;
		double den = 1;
		double sum = 0;
		for (int i = 0; i < 100; i++)
		{
		sum = sum + num/(den * den);
		den = den + 1;
		}
   IBIO.output("total is " + sum);
	}
}


/*

total is 1.6349839001848923

*/
