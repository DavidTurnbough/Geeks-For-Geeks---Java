// Name: David Turnbough
// Date: Tuesday October 20, 2020
// Geeks For Geeks: The Even Array
//https://practice.geeksforgeeks.org/problems/the-even-array/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]0page1
package the.even.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheEvenArray
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            String input = in.readLine();

            int index = 0;
            int changesNeeded = 0;

            while (index < input.length())
            {
                if (input.charAt(index) == 'O')
                {
                    changesNeeded++;
                    while (index < input.length() && input.charAt(index) == 'O')
                    {
                        index++;
                    }
                }
                else
                {
                    index++;
                }
            }

            System.out.printf("%d%n", changesNeeded);
        }
    }
}
