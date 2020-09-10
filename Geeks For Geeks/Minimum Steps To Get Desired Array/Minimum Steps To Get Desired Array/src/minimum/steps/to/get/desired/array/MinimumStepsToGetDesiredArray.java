//******************************************************************************
// Name: David Turnbough
// Date:
// Geeks For Geeks: Minimum Steps To Get Desired Array
// https://practice.geeksforgeeks.org/problems/minimum-steps-to-get-desired-array/0
//******************************************************************************
package minimum.steps.to.get.desired.array;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MinimumStepsToGetDesiredArray
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[] input = new int[size];

            for (int i = 0; i < size; ++i)
            {
                input[i] = in.nextInt();
            }

            sort(input);

            int numberOfSteps = 0;

            for(int i = 0; i < size; ++i)
            {
                if(input[i] >= 2 && input[i] % 2 != 0)
                {
                    input[i] -= 1;
                    numberOfSteps++;
                }
            }
            
            for (int i = 0; i < size; ++i)
            {
                int temp = 0;
                
                while (input[i] >= 2)
                {
                    input[i] /= 2;
                    temp++;
                }

                for (int j = i + 1; j < size && temp > 0; ++j)
                {
                    input[j] = (int)Math.ceil(input[j] / Math.pow(2, temp));
                }

                while (input[i] > 0)
                {
                    input[i] -= 1;
                    temp++;
                }
                       
                numberOfSteps += temp;
            }

            System.out.printf("%d%n", numberOfSteps);
        }
    }
}
