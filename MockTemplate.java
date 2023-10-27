/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class MockTemplate		// Replace "Template"with your specific class name
{
	
		public static void main(String[] args)
	{
		System.out.println("Aditya Mehta");
		int x = 0;
		int y = 1;
		int counter = 0;
		int terms = IBIO.inputInt ("How many terms: ");
		while (terms < 0)
		{
			System.out.println("Enter a positive number");
			terms = IBIO.inputInt("How many terms: ");
		}
		System.out.print(x +  "; ");
		System.out.print(y + "; ");
		while (counter < terms)
		{
			int z = x + y;
			x = y;
			y = z;
			counter = counter + 1;
			System.out.print(z + "; ");
		}
		
	}
	}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
