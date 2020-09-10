//******************************************************************************
// Name: David Turnbough
// Date: Tuesday February 12, 2020
// Geeks For Geeks: Tom And Jerry
// https://practice.geeksforgeeks.org/problems/tom-and-jerry/0
//******************************************************************************
package tom.and.jerry;

import java.util.Scanner;

public class TomAndJerry
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int number = in.nextInt();
            
            System.out.printf("%d%n", number % 2 == 0 ? 1 : 0);
        }
    }    
}