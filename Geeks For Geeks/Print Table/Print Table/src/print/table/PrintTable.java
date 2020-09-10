//******************************************************************************
// Name: David Turnbough
// Date: Wednesday June 5, 2019
// Geeks For Geeks: Print Table
// https://practice.geeksforgeeks.org/problems/print-table/0
//******************************************************************************
package print.table;

import java.util.Scanner;

public class PrintTable
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            for(int i = 0; i < 10; ++i)
            {
                System.out.printf("%d ", input * (i + 1));
            }
            System.out.printf("%n");
        }
    }
}