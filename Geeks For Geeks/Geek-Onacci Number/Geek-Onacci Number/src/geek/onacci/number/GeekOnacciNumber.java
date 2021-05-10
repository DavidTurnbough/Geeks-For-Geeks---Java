package geek.onacci.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * Name David Turnbough Jr
 * Date Monday May 10, 2021
 * Geeks For Geeks: Geek-onacci Number
 * https://practice.geeksforgeeks.org/problems/geek-onacci-number/0/?problemStatus=unsolved&problemType=full&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-2difficulty[]-1difficulty[]0page1
 */
public class GeekOnacciNumber
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            System.out.println(getNumber(arr, 3));
        }
    }
    
    public static int getNumber(int[] arr, int count)
    {
        if(arr[3] == count)
        {
            return arr[2];
        }
        else
        {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = arr[0] + arr[1] + temp;
        }
        
        return getNumber(arr, ++count);
    }
}