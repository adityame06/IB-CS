/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P16		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int x = IBIO.inputInt("How many terms: ");
		int y = 3;
		int z = 4;
		
		for (int i = 0; i < (x/2); i++)
		{
			IBIO.output(y);
			IBIO.output(z);
			y = y + z;
			z = z + y;
		}
	}
}


/*

How many terms: 6
3
4
7
11
18
29

*/
