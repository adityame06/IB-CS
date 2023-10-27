/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class PracticeTest		// Replace "Template"with your specific class name
{
	public static int factorial(int n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			return n * factorial(n-1);
		}
	}
	public static void main(String[] args)
	{
		int num = IBIO.inputInt("what number: ");
		IBIO.output(num + "! = " + factorial(num));

			}
	}
	



/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
