/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P41		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
   {
	int x = IBIO.inputInt("enter first number ");
	int y = IBIO.inputInt("enter second number ");
	boolean Valid = false;
do
	{
	IBIO.output("Press: [1] for addition");
	IBIO.output("Press: [2] for multiplication");
	IBIO.output("Press: [3] for quit");
	int op = IBIO.inputInt("enter an option ");
	switch (op)
		{
			case 1:
			IBIO.output(x + y);
			Valid = true;
			break;
			case 2:
			IBIO.output(x * y);
			Valid = true;
			break;
			case 3:
			break;
			default:
			IBIO.output("error: not a valid option");
		}
	} while (!Valid);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
