//******************************************************************************
// Name: David Turnbough
// Date: Thursday July 23, 2020
// Geeks For Geeks: Java Collection | Set 3 (HashMap) Part-1
// https://practice.geeksforgeeks.org/problems/java-hashmap/0
//******************************************************************************
package java.collection.pkg3;

import java.util.Scanner;
import java.util.HashMap;

public class JavaCollectionSet3HashMapPart1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            HashMap<String, Integer> dictionary = new HashMap<>();
            
            for(int i = 0; i < size; ++i)
            {
                String key = in.nextLine();
                int value = in.nextInt();
                in.nextLine();
                
                dictionary.put(key, value);
            }
            
            String searchKey = in.nextLine();
            
            if(dictionary.get(searchKey) == null)
            {
                System.out.printf("%d%n", -1);
            }
            else
            {
                System.out.printf("%d%n", dictionary.get(searchKey));
            }
        }
    }
}
