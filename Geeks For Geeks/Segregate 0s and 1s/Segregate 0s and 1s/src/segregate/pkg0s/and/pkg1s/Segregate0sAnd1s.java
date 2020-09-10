//******************************************************************************
// Name: David Turnbough
// Date: January 12, 2018 Friday
// Geeks for Geeks: Segregate 0s and 1s
// https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s/0
//******************************************************************************
package segregate.pkg0s.and.pkg1s;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class Segregate0sAnd1s
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases-- > 0)
        {
            int size = sc.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = sc.nextInt();
            }
            
            sort(arr);
            
            for(int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", arr[i]);
            }
            
            System.out.printf("%n");
        }
    }
}