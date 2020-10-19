// Name: David Turnbough
// Date: Sunday October 18, 2020
// Geeks For Geeks: Find Unique Element
// https://practice.geeksforgeeks.org/problems/find-unique-element/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1
package find.unique.element;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

//******************************************************************************
// Could not get this to work with the BufferedReader for the input stream.
//******************************************************************************
public class FindUniqueElement
{

    public static void main(String[] args) throws IOException
    {
        // Create an input stream to get input values
        Scanner in = new Scanner(System.in);

        // Get the number of test cases
        int testCases = in.nextInt();

        // Loop through the test cases
        while (testCases-- > 0)
        {
            // Convert the size and number of occurences to integer values
            int size = in.nextInt();
            int numberOfOccurences = in.nextInt();

            // Create an array to store the input elements
            String[] input = new String[size];
            
            // Get the array of elements for the array
            for (int i = 0; i < size; ++i)
            {
                input[i] = in.next();
            }

            // Create a hashmap to store each value and the number of times it
            //  occurs.
            HashMap< String, Integer> map = new HashMap<>();

            // loop through the array, storing each element into the hash map 
            //  along with a total of the number of times it occurs.
            for (int i = 0; i < size; ++i)
            {
                // Variable is used to keep track of the number of times an 
                //  element has occured previously
                int occurences = 0;

                // If the value has occured before increment it by one
                // else if it is a new value set it to occuring once
                if (map.containsKey(input[i]))
                {
                    occurences = map.get(input[i]) + 1;
                }
                else
                {
                    occurences++;
                }
                
                // Map the number of times the value has occured
                map.put(input[i], occurences);
            }

            // Loop through the hash map looking for the instance of an element
            //  that has not occured for the number of times it was required.
            for (int i = 0; i < size; ++i)
            {
                // Program exits the loop when the instance of the key occuring
                //  less than (technically could be greater than too) the number
                //  of times it was supposed to occur.
                if (map.get(input[i]) != numberOfOccurences)
                {
                    System.out.println(input[i]);
                    break;
                }
            }
        }
    }
}
