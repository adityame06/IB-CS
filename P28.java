/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P28		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int counter = 0;
		for (int i = 1; i <= 1000000; i++)
		{
		if (i%2 != 0 && i%3 !=0 && i%5 !=0 && i%7 !=0)
			counter++;
		}
		IBIO.output(counter);
	}
}


/*

228571

*/
