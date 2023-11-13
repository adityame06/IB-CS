/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P31		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
{
	int x;
	do
	{
		x = IBIO.inputInt("Enter an even number greater than 0 and less than 100: ");
	} while (x >= 100 || x <= 0 || x % 2 != 0);
	IBIO.output("Thank you");
}

}


/*

Enter an even number greater than 0 and less than 100: -1
Enter an even number greater than 0 and less than 100: 1
Enter an even number greater than 0 and less than 100: 100
Enter an even number greater than 0 and less than 100: 2
Thank you

*/
