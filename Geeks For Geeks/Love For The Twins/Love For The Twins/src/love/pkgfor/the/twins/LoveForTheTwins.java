//******************************************************************************
// Name: David Turnbough
// Date: Friday September 11, 2020
// Geeks For Geeks: Love For The Twins
// https://practice.geeksforgeeks.org/problems/love-for-the-twins/0
//******************************************************************************
package love.pkgfor.the.twins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LoveForTheTwins
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0)
        {
            int size = Integer.parseInt(br.readLine().replaceAll("\\s",""));

            String[] foo = br.readLine().split(" ");

            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < size; ++i)
            {
                // Used to determine how many times a value has been seen before.
                Integer count = map.get(foo[i]);

                // Each new instance of a value is added to the hash map.
                // If a value is in the hashmap, the number of instances of it
                //  is increased by one.
                if (count == null)
                {
                    map.put(foo[i], 1);
                }
                else
                {
                    map.put(foo[i], count + 1);
                }
            }

            // Used to keep track of the number times a value has been seen.
            int total = 0;

            // Loops through each key/value pair of the hash map.
            for (String keyValue : map.keySet())
            {
                // Used to store the value for each key, so its total can be added.
                int temp = map.get(keyValue);

                if (temp % 2 == 1)
                {
                    total += temp - 1;
                }
                else
                {
                    total += temp;
                }
            }

            System.out.print(total + "\n");
        }
    }
}
