//******************************************************************************
// Name: David Turnbough
// Date: Monday May 7, 2018
// Geeks for Geeks: Multiply Left and Right Array Sum
// https://practice.geeksforgeeks.org/problems/multiply-left-and-right-array-sum/0
//******************************************************************************
package multiply.left.and.right.array.sum;

import java.util.Scanner;

public class MultiplyLeftAndRightArraySum
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

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < size / 2; ++i)
            {
                leftSum += arr[i];
            }
            
            for (int i = (size / 2); i < size; ++i)
            {
                rightSum += arr[i];
            }
            
            System.out.printf("%d%n", leftSum * rightSum);
        }
    }
}
