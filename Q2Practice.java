/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Q2Practice		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		IBIO.output("Aditya Mehta");
		int x = IBIO.inputInt("Enter a number less than 10: ");
		int i = 0;
		int power = 1;
		while (x > 9 || x < 1)
		{
		IBIO.output("Error please enter again");
		x = IBIO.inputInt("Enter a number less than 10: ");
		}
		do
		{
			i++;
			power = power * x;
			if ((power) < 10)
			IBIO.output(i + " " + (i * i) + "          " + (power));
			if ((power) < 100 && (power) >= 10)
			IBIO.output(i + " " + (i * i) + "         " + (power));
			if ((power) < 1000 && (power) >= 100)
			IBIO.output(i + " " + (i * i) + "        " + (power));
			if ((power) < 10000 && (power) >= 1000)
			IBIO.output(i + " " + (i * i) + "      " + (power));
			if ((power) < 100000 && (power) >= 10000)
			IBIO.output(i + " " + (i * i) + "     " + (power));
			if ((power) < 1000000 && (power) >= 100000)
			IBIO.output(i + " " + (i * i) + "    " + (power));
			if ((power) < 10000000 && (power) >= 1000000)
			IBIO.output(i + " " + (i * i) + "   " + (power));
			if ((power) < 100000000 && (power) >= 10000000)
			IBIO.output(i + " " + (i * i) + "  " + (power));
			if ((power) < 1000000000 && (power) >= 100000000)
			IBIO.output(i + " " + (i * i) + " " + (power));
			
		} while (i < x);
	}
}


/*

Enter a number less than 10: 10
Error please enter again
Enter a number less than 10: -1
Error please enter again
Enter a number less than 10: 9
1 1          9
2 4         81
3 9        729
4 16      6561
5 25     59049
6 36    531441
7 49   4782969
8 64  43046721
9 81 387420489


*/
