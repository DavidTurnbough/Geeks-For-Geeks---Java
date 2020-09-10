//******************************************************************************
// Name: David Turnbough
// Date: January 15, 2018 Monday
// Geeks for Geeks: Missing Number in Array
// https://practice.geeksforgeeks.org/problems/missing-number-in-array/0
//******************************************************************************
package missing.number.in.array;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MissingNumberInArray
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size - 1; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            int missingNumber = arr[0];

            for (int i = 0; i < size - 1; ++i)
            {
                missingNumber++;
                
                if(missingNumber != arr[i])
                {
                    break;
                }
            }
            
            if(missingNumber == arr[0])
            {
                missingNumber++;
            }

            System.out.printf("%d%n", missingNumber);
        }
    }
}
