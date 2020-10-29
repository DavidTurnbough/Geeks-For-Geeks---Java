// Name: David Turnbough
// Date: Wednesday October 21, 2020
// Geeks For Geeks: Shortest Common Supersequence
// https://practice.geeksforgeeks.org/problems/shortest-common-supersequence/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=2&query=problemStatusunsolvedproblemTypefulldifficulty[]0page2
package shortest.common.supersequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortestCommonSupersequence
{
    public String createString(String stringA, String stringB)
    {
        return createString(stringA, stringB, new String());
    }
    
    public String createString(String stringA, String stringB, String finalString)
    {
        
        
        return finalString;
    }
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            String[] input = in.readLine().split(" ");

            String stringA = input[0];
            String stringB = input[1];

            int indexB = 0;

//Input:
//hxmngqmf gnapcnty
//
//Its Correct output is:
//15
            while (indexB < stringB.length())
            {
                if (!(stringA.indexOf(stringB.charAt(indexB)) > 0))
                {
                    stringA += stringB.charAt(indexB);
                }

                indexB++;
            }

            System.out.printf("%d%n", stringA.length());
        }
    }
}
