//******************************************************************************
// Name: David Turnbough
// Date: Tuesday October 15, 2019
// Geeks For Geeks: Alone In Couple
// https://practice.geeksforgeeks.org/problems/alone-in-couple/0
//******************************************************************************
package alone.in.couple;

import java.util.Arrays;
import java.util.Scanner;

public class AloneInCouple
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

            Arrays.sort(arr);
            
            
            int lonePerson = 0;
            int index = 0;
            
            while(index < arr.length - 1)
            {
                if(index == 0 && arr[index] != arr[index + 1])
                {
                    break;
                }
                else if(index == (arr.length - 1) && arr[index] != arr[index + 1])
                {
                    break;
                }
                else if(arr[index] != arr[index + 1] && arr[index] != arr[index - 1])
                {
                    break;
                }
                index++;
            }
            
            System.out.printf("%d%n", arr[index]);
        }
    }
}
