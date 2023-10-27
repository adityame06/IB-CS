/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Switchcase		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int x = IBIO.inputInt("enter a number: ");
		int y = IBIO.inputInt("enter another number: ");
		IBIO.output("Press: [1] for addition");
		IBIO.output("Press: [2] for multiplication");
		IBIO.output("Press: [3] for quit");
		int n = IBIO.inputInt("Which number: ");

		switch (n)
			{
				case 1:
					IBIO.output("You have chosen addition");
					IBIO.output(x + "+" + y + "=" + (x+y));
					break;
				case 2:
					IBIO.output("You have chosen multiplication");
					IBIO.output(x + "x" + y + "=" + (x*y));
					break;
				case 3:
					break;
				default:
					IBIO.output("that number was neither 1, 2 or 3");
					break;
			}
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
// input number,if string contains (x, /) using switch case, perform operation
