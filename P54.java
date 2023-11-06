/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P54		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		double num = 1;
		double xnum = 2;
		double den = 3;
		double xden = 5;
		double sum = 1;
		for (int i = 0; i < 100; i++)
		{
		sum = sum + num/den;
		num = num * xnum;
		den = den * xden;
		xnum = xnum + 1;
		xden = xden + 2;
		}
   IBIO.output("Pi is " + 2*sum);
	}
}


/*

Pi is 3.1415926535897922

*/
