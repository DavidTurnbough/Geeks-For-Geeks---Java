//******************************************************************************
// Name: David Turnbough
// Date: January 6, 2018 Saturday
// Geeks for Geeks: Tough Competitors
// https://practice.geeksforgeeks.org/problems/tough-competitors/0
//******************************************************************************
package tough.competitors;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class ToughCompetitors
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            sort(arr);
            
            int skillDifference = 999999;
            
            for(int i  = 0; i < size - 1; ++i)
            {
                int temp = Math.abs(arr[i] - arr[i+1]);
                
                if(temp < skillDifference)
                {
                    skillDifference = temp;
                }
            }
            
            System.out.printf("%d%n", skillDifference);
        }
    }
}
