//******************************************************************************
// Name: David Turnbough
// Date: Tuesday August 14, 2018
// Geeks for Geeks: Case-Specific Sorting of Strings
// https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings/0
//******************************************************************************
package pkgcase.specific.sorting.of.strings;

import java.util.Scanner;

public class CaseSpecificSortingOfStrings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            in.nextLine();
            
            String input = in.nextLine();
            
            char arr[] = input.toCharArray();
            
            for(int i = 0; i < size; ++i)
            {
                for(int j = i + 1; j < size; ++j)
                {               
                    char temp = arr[j];
                    if(Character.isLowerCase(arr[i]) && Character.isLowerCase(arr[j]) && arr[i] > arr[j])
                    {
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                    else if(Character.isUpperCase(arr[i]) && Character.isUpperCase(arr[j]) && arr[i] > arr[j])
                    {
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
              
            }
            
            System.out.println(arr);
            
        }
    }   
}