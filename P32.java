/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P32		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
{
	int i=1;
    int x = IBIO.inputInt("Enter a number: ");
    if (x == 1)
    {x = IBIO.inputInt("Enter a number: ");}
	do
		{ i++; } while (x % i != 0);
	if (i == x)
	IBIO.output("Prime");
	else
    IBIO.output(x + " is divisible by " + i);
}

}


/*

Enter a number: 5
Prime

Enter a number: 49
49 is divisible by 7

*/
