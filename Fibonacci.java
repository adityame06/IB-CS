public class Fibonacci {
	
	public static void main (String[] args)
	{
		int a  = 0;
		int b = 1;
		int counter = 0;
		int terms = IBIO.inputInt("how many terms: ");
		System.out.println(a);
		System.out.println(b);
		while (counter < terms)
		{
			int x = a + b;
			a = b;
			b = x;
			counter += 1;
			System.out.println(x);
		}
	}
}

