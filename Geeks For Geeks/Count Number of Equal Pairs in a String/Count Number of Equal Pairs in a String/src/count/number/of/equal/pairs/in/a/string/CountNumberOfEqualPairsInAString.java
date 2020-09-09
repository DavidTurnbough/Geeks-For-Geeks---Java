//******************************************************************************
// Name: David Turnbough
// Date: January 15, 2018 Monday
// Geeks for Geeks: Count Number of Equal Pairs in a String
// https://practice.geeksforgeeks.org/problems/count-number-of-equal-pairs-in-a-string/0
//******************************************************************************
package count.number.of.equal.pairs.in.a.string;

import java.util.Scanner;

public class CountNumberOfEqualPairsInAString
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int testCases = input.nextInt();
        input.nextLine();
        
        while(testCases-- > 0)
        {
            String inputValue = input.nextLine();
            
            int numberOfPairs = 0;
            
            for(int i = 0; i < inputValue.length(); ++i)
            {
                for(int j = 0; j < inputValue.length(); ++j)
                {
                    if(inputValue.charAt(i) == inputValue.charAt(j))
                    {
                        numberOfPairs++;
                    }
                }
            }
            
            System.out.println(numberOfPairs);
        }
    }
}