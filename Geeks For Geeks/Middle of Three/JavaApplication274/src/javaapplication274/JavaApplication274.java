//******************************************************************************
// Name: David Turnbough
// Date: Friday September 11, 2020
// Geeks For Geeks: Middle of Three
// https://practice.geeksforgeeks.org/problems/middle-of-three/0
//******************************************************************************
package javaapplication274;

import java.io.IOException;
import static java.util.Arrays.sort;
import java.util.Scanner;

public class JavaApplication274
{
    public static final int MAX_SIZE = 3;

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int[] numbers = new int[MAX_SIZE];
            
            for(int i = 0; i < MAX_SIZE; ++i)
            {
                numbers[i] = in.nextInt();
            }
            
            sort(numbers);
            
            System.out.print(numbers[1] + "\n");
        }
    }
}
