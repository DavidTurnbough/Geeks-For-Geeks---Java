package weight.of.strings;

import java.util.Scanner;

/**
 * 
 * Name: David Turnbough Jr
 * Date: Monday May 10, 2021
 * Geeks For Geeks: Weight Of Strings
 * https://practice.geeksforgeeks.org/problems/weight-of-strings/0/?problemStatus=unsolved&problemType=full&difficulty[]=-2&difficulty[]=-1&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-2difficulty[]-1page1
 * 
 */

public class WeightOfStrings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            
            String string1 = in.nextLine();
            String string2 = in.nextLine();
            
            int weight1 = getWeight(string1);
            int weight2 = getWeight(string2);
            
            if(weight1 > weight2)
            {
                System.out.println(1);
            }
            else if(weight2 > weight1)
            {
                System.out.println(2);
            }
            else
            {
                System.out.println("equal");
            }
        }
    }
    
    public static int getWeight(String string)
    {
        int weight = 0;
        
        for(int i = 0; i < string.length(); ++i)
        {
            weight += (int)Character.toLowerCase(string.charAt(i)) - 96;
        }
        
        return weight;
    }
}
