//******************************************************************************
// Name: David Turnbough
// Date: January 11, 2018 Thursday
// Geeks for Geeks: Adding Ones
// https://practice.geeksforgeeks.org/problems/adding-ones/0
//******************************************************************************
package adding.ones;

import java.util.Scanner;

public class AddingOnes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases-- > 0)
        {
            int outputSize = sc.nextInt();
            int inputSize = sc.nextInt();
            
            int[] outputArray = new int[outputSize];
            int[] inputArray = new int[inputSize];
            
            for(int i = 0; i < outputSize; ++i)
            {
                outputArray[i] = 0;
            }
            
            for(int i = 0; i < inputSize; ++i)
            {
                inputArray[i] = sc.nextInt();
            }
            
            for(int i = 0; i < inputSize; ++i)
            {
                for(int j = (inputArray[i] - 1); j < outputSize; ++j)
                {
                    outputArray[j] = outputArray[j] + 1;
                }
            }
            
            for(int i = 0; i < outputSize; ++i)
            {
                System.out.printf("%d ", outputArray[i]);
            }
            
            System.out.printf("%n");
            
        }
    }
}