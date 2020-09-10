//******************************************************************************
// Name: David Turnbough
// Date: Tuesday August 14, 2018
// Geeks for Geeks: Rotate a 2D Array Without Using Extra Space
// https://practice.geeksforgeeks.org/problems/rotate-a-2d-array-without-using-extra-space/0
//******************************************************************************
package rotate.a.pkg2d.array.without.using.extra.space;

import java.util.Scanner;

public class RotateA2DArrayWithoutUsingExtraSpace
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[][] arr = new int[size][size];
            
            for(int i = 0; i < size; ++i)
            {
                for(int j = 0; j < size; ++j)
                {
                    arr[i][j] = in.nextInt();
                }
            }
            
            
        }
    }
}