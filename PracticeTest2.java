/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class PracticeTest2
{
    public static void main(String[] args)
    {
        int n;

        do
        {
            n = IBIO.inputInt("What number: ");

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers. Please enter a positive number.");
            }
        } while (n < 0);

        long factorial = 1;
        int i = 2;

        while (i <= n)
        {
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of " + n + " is " + factorial);
    }
}






	



/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
