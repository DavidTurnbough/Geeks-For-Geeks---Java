// Name: David Turnbough
// Date: Tuesday October 20, 2020
// Geeks For Geeks: Good Pairs
// https://practice.geeksforgeeks.org/problems/good-pairs/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]0page1

package good.pairs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoodPairs
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());
            
            String[] rawInput = in.readLine().split(" ");
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(rawInput[i]);
            }
            
            Arrays.sort(arr);
            
            int goodPairs = 0;
            
            for(int i = 0; i < size; ++i)
            {
                for(int j = i; j < size - 1 && arr[i] < arr[j]; ++j)
                {
                    if(arr[i] < arr[j])
                    {
                        goodPairs++;
                    }
                }
            }
            
            System.out.printf("%d%n", goodPairs);
            
        }
    }
}