/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class P24		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 11; i++)
		{
			if((i*i*i)<10)
			{IBIO.output("   " + (i * i * i));}
			else if((i*i*i)>=10 && (i*i*i)<100)
			{IBIO.output("  " + (i * i * i));}
			else if((i*i*i)>=100 && (i*i*i)<1000)
			{IBIO.output(" " + (i * i * i));}
			else
			{IBIO.output((i * i * i));}
		}

	}
}


/*

   1
   8
  27
  64
 125
 216
 343
 512
 729
1000

*/
