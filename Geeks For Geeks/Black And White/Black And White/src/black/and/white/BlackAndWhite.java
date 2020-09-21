//******************************************************************************
// Name: David Turnbough
// Date: Sunday September 20, 2020
// Geeks For Geeks: Black And White
// https://practice.geeksforgeeks.org/problems/black-and-white/0
//******************************************************************************
package black.and.white;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackAndWhite
{
    public static void getMoves()
    {
        
        
    }
    
    
    
    // if position 1 != poistion 2
    
    // if position 1 or position 2 can attack the other 
    
    
    
    public static void getMoves(int[][] arr)
    {
        
    }
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            String[] input = in.readLine().split(" ");
            
            int rows = Integer.parseInt(input[0]);
            int cols = Integer.parseInt(input[1]);
            
            int[][] arr = new int[rows][cols];
            
            //System.out.printf("%d%n", getMoves(arr));
            
        }
    }
}