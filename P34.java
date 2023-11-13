/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P34		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
	int x = IBIO.inputInt("Enter a number: ");
	int i = 0;
	do
	{
		if (x % 2 == 0)
			x = x/2;
		else
			x = (x*3) + 1;
		i++;
	} while (x !=1);
	IBIO.output(i);
	}
}


/*

Enter a number: 3
7

*/
