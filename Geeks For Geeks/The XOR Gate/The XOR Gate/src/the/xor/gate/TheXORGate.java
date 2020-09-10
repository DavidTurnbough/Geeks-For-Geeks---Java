//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 19, 2018
// Geeks for Geeks: The XOR Gate
// https://practice.geeksforgeeks.org/problems/the-xor-gate/0
//******************************************************************************
package the.xor.gate;

import java.util.Scanner;

public class TheXORGate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int numberOfInputs = in.nextInt();
            int total = 0;
            
            for(int i = 0; i < numberOfInputs; ++i)
            {
                total += in.nextInt();
                
                if(total == 2)
                {
                    total = 0;
                }
            }
            
            System.out.printf("%d%n", total);
        }
    }
}