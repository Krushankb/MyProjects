import java.util.Scanner;
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int factorial = 1;
        while(num != 0)
        {
            factorial = num*factorial;
            num--;
        }
        System.out.println(factorial);
    }
}
