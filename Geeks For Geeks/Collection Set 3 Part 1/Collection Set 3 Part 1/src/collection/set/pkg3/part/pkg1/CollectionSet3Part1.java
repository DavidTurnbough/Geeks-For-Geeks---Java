//******************************************************************************
// Name: David Turnbough
// Date: Thursday July 23, 2020
// Geeks For Geeks: Java Collection | Set 3 (HashMap) Part-1
// https://practice.geeksforgeeks.org/problems/java-hashmap/0
//******************************************************************************
package collection.set.pkg3.part.pkg1;

import java.util.HashMap;
import java.util.Scanner;

public class CollectionSet3Part1
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();
            in.nextLine();

            HashMap<String, Integer> dictionary = new HashMap<>();

            for (int i = 0; i < size; ++i)
            {
                String key = in.next();
                int value = in.nextInt();

                dictionary.put(key, value);
            }
            in.nextLine();

            String searchKey = in.nextLine();

            if (dictionary.get(searchKey) == null)
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
