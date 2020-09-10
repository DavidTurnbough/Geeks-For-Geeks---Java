package ishaan.loves.chocolates;

import java.util.Scanner;

public class IshaanLovesChocolates
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            int smallestValue = arr[0] + 1;
            
            for(int i = 0; i < size; ++i)
            {
                if(smallestValue > arr[i])
                {
                    smallestValue = arr[i];
                }
            }
            
            System.out.printf("%d%n", smallestValue);
        }
    }
}