/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Test		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int n;
		IBIO.output("Aditya Mehta");
	do
	{ long factorial = 1;
			int i = 2;
		do
			{
				n = IBIO.inputInt("Input a number between 1 and 20: ");
				if(n <= 0)
				{
					IBIO.output("ERROR - Enter a positive number: ");
				}
				if(n > 20)
				{
					IBIO.output("ERROR - Enter a positive number: ");
				}
			}
			while(n<0);
	if (n<=20) {
		while (i <= n)
			{
				factorial *= i;
				i++;
			}
			System.out.println(n + "! = " + factorial);
		}
	} while (n !=0);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
