package special.odd.series.sum;

import java.util.Scanner;

public class SpecialOddSeriesSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            int total = 0;
            int oddNumber = 1;
            
            for(int i = 0; i < input; ++i)
            {
                total += total + oddNumber;
                System.out.println("Here : " + total);
                oddNumber += 2;
            }
            
            System.out.printf("%d%n", total);
        }
    }
}