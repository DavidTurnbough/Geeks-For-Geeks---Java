//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 25, 2019
// Geeks For Geeks: Compete The Skills
// https://practice.geeksforgeeks.org/problems/compete-the-skills/0
//******************************************************************************
package compete.the.skills;

import java.util.Scanner;

public class CompeteTheSkills
{
    final static int SIZE = 3;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int[] a = new int[SIZE];
            int[] b = new int[SIZE];
            
            for(int i = 0; i < SIZE; ++i)
            {
                a[i] = in.nextInt();
            }
            
            for(int i = 0; i < SIZE; ++i)
            {
                b[i] = in.nextInt();
            }
            
            int sumA = 0;
            int sumB = 0;
            
            for(int i = 0; i < SIZE; ++i)
            {
                if(a[i] == b[i])
                {
                    continue;
                }
                else if(a[i] > b[i])
                {
                    sumA++;
                }
                else
                {
                    sumB++;
                }
            }
            
            System.out.printf("%d %d%n", sumA, sumB);
        }
    }
}