//******************************************************************************
// Name: David Turnbough
// Date: Sunday September 20, 2020
// Geeks For Geeks: Minimum Energy
// https://practice.geeksforgeeks.org/problems/minimum-energy/0
//******************************************************************************
package minimum.energy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumEnergy
{
    // Method to determine the minimum energy starting from zero required to 
    //  go across the entire array.
    public static int getEnergyRequired(int size, int[] arr)
    {
        int minimumEnergyRequired = 0;
        int currentEnergyRequired = 0;
        
        // Loop through the entire array looking for the lowest sumation from the
        //  begining. The minimum energy to cross the array will be this value,
        //  plus one, for the initial position.
        for(int i = 0; i < size; ++i)
        {
            currentEnergyRequired += arr[i];
            
            if(currentEnergyRequired < minimumEnergyRequired)
            {
                minimumEnergyRequired = currentEnergyRequired;
            }
        }
        
        return minimumEnergyRequired;
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            // Get the input information, and convert it to an array of numbers
            int size = Integer.parseInt(in.readLine());
            
            String[] input = in.readLine().split(" ");
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(input[i]);
            }
            
            // Calculate the minimum energy required, by calling on a method
            int energyRequired = Math.abs(getEnergyRequired(size, arr)) + 1;
            
            // Output the final answer
            System.out.printf("%d%n", energyRequired);
        }
    }
}