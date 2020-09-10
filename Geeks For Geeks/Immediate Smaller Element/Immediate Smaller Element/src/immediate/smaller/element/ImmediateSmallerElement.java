//******************************************************************************
// Name: David Turnbough
// Date: Sunday August 5, 2018
// Geeks for Geeks: Immediate Smaller Element
// https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0
//******************************************************************************
package immediate.smaller.element;

import java.util.Scanner;

public class ImmediateSmallerElement
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

            if (size > 1)
            {
                for (int i = 0; i < size; ++i)
                {
                    if(i == size - 1)
                    {
                        arr[i] = -1;
                    }
                    else if(arr[i] > arr[i + 1])
                    {
                        arr[i] = arr[i+1];
                    }
                    else
                    {
                        arr[i] = -1;
                    }
                }
            }
            else
            {
                arr[size - 1] = -1;
            }

            for (int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", arr[i]);
            }

            System.out.printf("%n");
        }
    }
}
