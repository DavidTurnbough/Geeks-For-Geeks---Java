//******************************************************************************
// Name: David Turnbough
// Date: Monday February 10, 2020
// Geeks For Geeks: Binary Representation
// https://practice.geeksforgeeks.org/problems/binary-representation/0
//******************************************************************************
package binary.representation;

import java.util.Scanner;

public class BinaryRepresentation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            long inputValue = in.nextLong();
            
            String binaryValue = Long.toBinaryString(inputValue);
            
            while(binaryValue.length() < 14)
            {
                binaryValue = "0" + binaryValue;
            }
            
            System.out.printf("%s%n", binaryValue);
            
            
        }
    }

}
