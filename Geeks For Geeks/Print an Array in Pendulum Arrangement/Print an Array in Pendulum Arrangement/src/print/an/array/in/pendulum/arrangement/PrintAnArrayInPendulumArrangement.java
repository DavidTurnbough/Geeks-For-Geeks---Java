//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 8, 2018
// Geeks for Geeks: Print an Array in Pendulum Arrangement
// https://practice.geeksforgeeks.org/problems/print-an-array-in-pendulum-arrangement/0
//******************************************************************************
package print.an.array.in.pendulum.arrangement;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class PrintAnArrayInPendulumArrangement
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

            sort(arr);

            int index = size - 1;

            while (index >= 0)
            {
                System.out.printf("%d ", arr[index]);
                index -= 2;
            }
            
            if (index == -1)
            {
                index += 1;
            }
            else
            {
                index += 3;
            }

            while (index < size)
            {
                System.out.printf("%d ", arr[index]);
                index += 2;
            }

            System.out.printf("%n");
        }
    }
}
