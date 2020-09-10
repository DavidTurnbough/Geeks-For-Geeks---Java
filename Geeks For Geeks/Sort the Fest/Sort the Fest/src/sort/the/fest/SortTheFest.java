//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 19, 2018
// Geeks for Geeks: Sort The Fest
// https://practice.geeksforgeeks.org/problems/sort-the-fest/0
//******************************************************************************
package sort.the.fest;

import java.util.Scanner;

public class SortTheFest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            String[] resturauntA = new String[5];
            String[] resturauntB = new String[5];
            boolean matchFound = false;
            
            for(int i = 0; i < 5; ++i)
            {
                resturauntA[i] = in.next();
            }
            
            for(int i = 0; i < 5; ++i)
            {
                resturauntB[i] = in.next();
            }
            
            for(int i = 0; i < 5 && !matchFound; ++i)
            {
                for(int j = 0; j < 5 && !matchFound; ++j)
                {
                    if(resturauntA[i].equals(resturauntB[j]))
                    {
                        matchFound = true;
                    }
                }
            }
            
            System.out.printf("%S%n", matchFound ? "CHANGE" : "BEHAPPY");
        }
    }
}