//******************************************************************************
// Name: David Turnbough
// Date: Friday May 18, 2018
// Geeks for Geeks: Java if-else (Decision Making)
// https://practice.geeksforgeeks.org/problems/java-if-else-decision-making/0
//******************************************************************************
package decision.making;

import java.util.Scanner;

public class DecisionMaking
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int firstValue = in.nextInt();
            int secondValue = in.nextInt();

            String output;

            if (firstValue == secondValue)
            {
                output = "equal";
            }
            else if (firstValue < secondValue)
            {
                output = "lesser";
            }
            else
            {
                output = "greater";
            }

            System.out.printf("%s%n", output);
        }
    }
}
