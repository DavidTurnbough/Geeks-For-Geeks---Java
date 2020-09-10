//******************************************************************************
// Name: David Turnbough
// Date: January 7, 2018 Sunday
// Geeks for Geeks: Non-Repeating Element
// https://practice.geeksforgeeks.org/problems/non-repeating-element/0
//******************************************************************************
package non.repeating.element;

import java.util.Scanner;

public class NonRepeatingElement
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }

            int oddValue = 0;

            for (int i = 0; i < size; ++i)
            {
                boolean match = false;
                
                for (int j = 0; j < size; j++)
                {
                    if(arr[i] == arr[j] && i != j)
                    {
                        // a match has been found
                        match = true;
                        break;
                    }
                }
                
                if(match == false)
                {
                    oddValue = arr[i];
                    break;
                }
            }

            System.out.printf("%d%n", oddValue);

        }
    }
}
