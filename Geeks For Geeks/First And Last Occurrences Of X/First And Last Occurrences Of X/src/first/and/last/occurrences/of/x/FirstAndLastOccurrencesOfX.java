/**
 * Name: David Turnbough
 * Date: Thursday
 * Geeks For Geeks: First And Last Occurrences Of X
 */
package first.and.last.occurrences.of.x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstAndLastOccurrencesOfX
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            String firstInput[] = in.readLine().split(" ");

            int size = Integer.parseInt(firstInput[0]);
            int value = Integer.parseInt(firstInput[1]);
            
            String secondInput[] = in.readLine().split(" ");

            int arr[] = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(secondInput[i]);
            }

            boolean searchingForValue = true;

            int valueIndex = (size / 2) - 1;
            
            System.out.println(valueIndex);

            for(int i = 0; i < (int)Math.sqrt(size); ++i)
            {
                if (arr[valueIndex] == value)
                { 
                    searchingForValue = false;
                }
                else if (arr[valueIndex] < value)
                {
                    valueIndex = valueIndex + size;
                }
                else
                {
                    valueIndex = valueIndex / 2;
                }
                
                
            }
            
            System.out.println("Here " + value);

            int low = valueIndex;
            int high = valueIndex;
            
            System.out.println(valueIndex);

            while (arr[high] == value && high < size)
            {
                high++;
            }
            
            high--;

            while (arr[low] == value && low > 0)
            {
                low--;
            }
            
            low++;

            if (searchingForValue && arr[low] != value)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(low + " " + high);
            }

        }
    }

}
