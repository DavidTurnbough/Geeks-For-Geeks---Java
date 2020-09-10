//******************************************************************************
// Name: David Turnbough
// Date: Tuesday January 1, 2019
// Geeks For Geeks: Mean
// https://practice.geeksforgeeks.org/problems/mean/0
//******************************************************************************
package mean;

import java.util.Scanner;

public class Mean
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int numberOfStudents = in.nextInt();
            int gradeTotal = 0;
            
            for(int i = 0; i < numberOfStudents; ++i)
            {
                gradeTotal += in.nextInt();
            }
            
            System.out.printf("%d%n", (gradeTotal / numberOfStudents));
        }
    }
}