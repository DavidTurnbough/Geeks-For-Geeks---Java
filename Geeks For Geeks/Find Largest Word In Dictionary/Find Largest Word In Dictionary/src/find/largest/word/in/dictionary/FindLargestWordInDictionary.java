// Name: David Turnbough
// Date: Saturday October 31, 2020
// Geeks For Geeks: Find Largest Word In Dictionary
//https://practice.geeksforgeeks.org/problems/find-largest-word-in-dictionary/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]0page1

package find.largest.word.in.dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindLargestWordInDictionary
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());
            
            String[] dict = in.readLine().split(" ");
            
            String str = in.readLine();
            
            int index = dict[0].length();
            
            for(int i = 0; i < size; ++i)
            {
                if(str.contains(dict[i]) && dict[i].length() > dict[index].length())
                {
                    System.out.println(dict[i]);
                    index = i;
                }
            }
            
            // Output answer
            System.out.printf("%s%n", dict[index]);
        }
    }
}