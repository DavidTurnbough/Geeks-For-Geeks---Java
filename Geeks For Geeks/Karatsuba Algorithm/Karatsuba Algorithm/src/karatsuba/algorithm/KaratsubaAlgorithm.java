//******************************************************************************
// Name: David Turnbough
// Date: Friday September 11, 2020
// Geeks For Geeks : Karatsuba Algorithm
// https://practice.geeksforgeeks.org/problems/karatsuba-algorithm/0
//******************************************************************************
package karatsuba.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaratsubaAlgorithm
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(bf.readLine());
        
        while(testCases-- > 0)
        {
            String[] input = bf.readLine().split(" ");
            
            // Setting this equal to one, so when it is multiplied against the
            //  input values, it will give a correct total.
            int total = 1;
            
            for(int i = 0; i < input.length; ++i)
            {
                // Convert the binary input value to decimal value, and multiply
                //  it by the previously converted binary values. The initial
                //  multiplied value is set to one, to ensure the values are
                //  multiplied correctly.
                total *= Integer.parseInt(input[i], 2);
            }
            
            System.out.print(total + "\n");
        }
    }
}