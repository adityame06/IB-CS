/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P42		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
{
int i = 1;
int x = 0;
do
	{
		int r = i%3;
		switch (r)
		{
			case 0:
			x += i * -5;
			break;
			case 1:
			x += i * 7;
			break;
			case 2:
			x += i * 2;
			break;
		}
		i++;
	} while (i < 1001);
	IBIO.output(x);
}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
