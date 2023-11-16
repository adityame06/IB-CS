/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P12		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int n = IBIO.inputInt("Enter starting number: ");
		int x = IBIO.inputInt("Enter number of steps: ");
		int y = IBIO.inputInt("Enter increment: ");
		for (int i = 0; i < x; i++)
		{
			IBIO.output(n);
			n = n + y;
		}
	}
}


/*

Enter starting number: 3
Enter number of steps: 4
Enter increment: 2
3
5
7
9

*/
