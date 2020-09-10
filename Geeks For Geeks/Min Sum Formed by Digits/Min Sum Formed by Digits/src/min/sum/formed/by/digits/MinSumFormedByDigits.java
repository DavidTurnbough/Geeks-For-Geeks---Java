//******************************************************************************
// Name: David Turnbough
// Date: January 10, 2018 Wednesday
// Geeks for Geeks: Min Sum Formed by Digits
// https://practice.geeksforgeeks.org/problems/min-sum-formed-by-digits/0
//******************************************************************************
package min.sum.formed.by.digits;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MinSumFormedByDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases-- > 0)
        {
            int size = sc.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = sc.nextInt();
            }
            
            sort(arr);
            
            int firstValue = 0;
            int secondValue = 0;
            
            for(int i = 0; i < size; ++i)
            {
                if(i % 2 == 0)
                {
                    firstValue *= 10;
                    firstValue += arr[i];
                }
                else
                {
                    secondValue *= 10;
                    secondValue += arr[i];
                }
            }
            
            System.out.printf("%d%n", firstValue + secondValue);
            
        }
    }
}