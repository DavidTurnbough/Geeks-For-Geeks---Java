//******************************************************************************
// Geeks for Geeks : Count of Smaller Elements
// https://practice.geeksforgeeks.org/problems/count-of-smaller-elements/0
//******************************************************************************
package count.of.smaller.elements;

import java.util.Scanner;

public class CountOfSmallerElements
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCases = 0;
        int arraySize = 0;
        int[] myArray = null;

        testCases = input.nextInt();

        while (testCases-- > 0)
        {
            arraySize = input.nextInt();
            
            myArray = new int[arraySize];
            
            for (int i = 0; i < arraySize; ++i)
            {
                myArray[i] = input.nextInt();
            }

            int testValue = input.nextInt();

            int count = 0;

            for (int i = 0; i < arraySize; ++i)
            {
                if(myArray[i] > testValue)
                {
                    break;
                }
                else
                {
                    count++;
                }
            }

            System.out.println(count);

        }
    }
}