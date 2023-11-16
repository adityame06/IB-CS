/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P43
{
	public static void main(String[] args)
	{
		int n = IBIO.inputInt("Enter a number less than 1000: ");
		boolean found = false;
		while (n>999)
		{
			n = IBIO.inputInt("Enter a number less than 1000: ");
		}
		for(int x = 1; x <= n; x++)
		{
			for(int y = 1; y <= n; y++)
				{
					int search = x*x + y*y;
					if(search == n)
						{
							found = true;
							System.out.println(x + " " +y);
							return;
						}
				}
		}
		if (found == false)
			{
				System.out.println("Impossible");
			}
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
