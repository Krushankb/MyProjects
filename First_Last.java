import java.util.Scanner;
/**
 * Write a description of class First_Last here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class First_Last
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int num;
        int firstNum = 0;
        int lastNum = 0;
        int count = 1;
        num = s.nextInt();
        while((num != 0))
        {
            if(count == 1)
            {
                lastNum = num%10;
            }
            count++;
            if(num/10 == 0)
            {
                firstNum = num;
            }
            num /= 10;
        }
        int sum = firstNum + lastNum;
        System.out.println(sum);
        System.out.println();
    }
}

