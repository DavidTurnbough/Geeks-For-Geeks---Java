//******************************************************************************
// Name: David Turnbough
// Date: January 6, 2018 Saturday
// Geeks for Geeks : Maximum Triplet Sum in Array
// https://practice.geeksforgeeks.org/problems/maximum-triplet-sum-in-array/0
//******************************************************************************
package maximum.triplet.sum.in.array;

import java.util.Scanner;

public class MaximumTripletSumInArray
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[] arr = {-999999, -999999, -999999};

            for (int i = 0; i < size; ++i)
            {
                int temp = in.nextInt();

                if(temp > arr[0])
                {
                    arr[0] = temp;
                }
                
            }

            System.out.printf("%d%n", (arr[0] + arr[1] + arr[2]));
        }
    }
}
