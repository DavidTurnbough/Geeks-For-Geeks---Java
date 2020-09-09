//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 23, 2018
// Geeks For Geeks: Binary String
// https://practice.geeksforgeeks.org/problems/binary-string/0
//******************************************************************************
package binary.string;

import java.util.Scanner;

public class BinaryString
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();
            in.nextLine();
            
            String binaryString = in.nextLine();

            int substringCount = 0;

            for (int i = 0; i < size; ++i)
            {
                if (binaryString.charAt(i) == '1')
                {
                    for (int j = size - 1; j > i; --j)
                    {
                        if(binaryString.charAt(j) == '1')
                        {
                            substringCount++;
                        }
                    }
                }
            }

            System.out.printf("%d%n", substringCount);
        }
    }
}
