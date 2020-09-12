//******************************************************************************
// Name: David Turnbough
// Date: Friday September 10, 2020
// Geeks For Geeks: Swap All Odd And Even Bits
// https://practice.geeksforgeeks.org/problems/swap-all-odd-and-even-bits/0
//******************************************************************************
package swap.all.odd.and.even.bits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapAllOddAndEvenBits
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(br.readLine());
        
        while(testCases-- > 0)
        {
            String input = br.readLine().replaceAll("\\s", "");
            
            // Convert the input value to binary, with 8 bits, all missing leading
            //  bits will be zeros.
            String binaryRepresentation = ("00000000" + Integer.toBinaryString(Integer.parseInt(input)))
                    .substring(Integer.toBinaryString(Integer.parseInt(input)).length());

            // Create a string builder so the bits can be appended.
            StringBuilder answer = new StringBuilder();
            
            for(int i = 0; i < binaryRepresentation.length() - 1; i += 2)
            {
                // swap odd and even bits in the string, and append them to the
                //  output string.
                answer.append(binaryRepresentation.charAt(i + 1));
                answer.append(binaryRepresentation.charAt(i));
            }
            
            // Convert the final bit form string back to a decimal value.
            System.out.println(Integer.parseInt(new String(answer), 2));
            
        }
    }
}