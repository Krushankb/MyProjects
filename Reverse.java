import java.util.Scanner;
/**
 * Write a description of class Reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse
{
    public static void main(String [] args)
    {
        Scanner ask = new Scanner(System.in);
        String ifYes = "y";
        Scanner s = new Scanner(System.in);
        int num;
        while(ifYes.equals("y"))
        {
            num = s.nextInt();
            while((num != 0))
            {
                System.out.print(num%10);
                num /= 10;
            }
            System.out.println();
            System.out.println("Do you wish to continue to input values? (y/n) ");
            ifYes = ask.next();
        }
    }
}
