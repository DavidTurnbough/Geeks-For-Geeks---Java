/**
 * Name: David Turnbough
 * Date: Saturday January 2, 2020
 * Geeks For Geeks: Confused Pappu
 * https://practice.geeksforgeeks.org/problems/confused-pappu/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1
 */
package confused.pappu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConfusedPappu
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int input = Integer.parseInt(in.readLine());
            
            int output = 0;
            
            while(input > 0)
            {
                int temp = input % 10;
                
                input = input / 10;
                
                output = output * 10;
                
                if(temp == 6)
                {
                    output = output + 3;
                }
            }
            
            System.out.printf("%d%n", output);
        }
    }
}