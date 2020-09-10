//******************************************************************************
// Name: David Turnbough
// Date: Thursday July 5, 2019
// Geeks For Geeks: Sum Of Numbers In String
// https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string/0
//******************************************************************************
package sum.of.numbers.in.string;

import java.util.Scanner;

public class SumOfNumbersInString
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String input = in.nextLine();
            
            int sum = 0;
            int total = 0;

            for(int i = 0; i < input.length(); ++i)
            {
                if(Character.isDigit(input.charAt(i)))
                {
                    while(i < input.length() && Character.isDigit(input.charAt(i)))
                    {
                        sum *= 10;
                        sum += Character.getNumericValue(input.charAt(i));
                        i++;
                    }
                    
                    if(sum > 0)
                    {
                        total += sum;
                        sum = 0;
                    }
                }
            }

            System.out.printf("%d%n", total);
        }
    }
}
