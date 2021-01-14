/**
 * Name: David Turnbough
 * Date: Thursday January 14, 2020
 * Geeks For Geeks: Find First Repeated Character
 */
package find.first.repeated.character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class FindFirstRepeatedCharacter
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            String input = in.readLine();
            
            Hashtable<Character, Integer> table = new Hashtable<>();
            
            boolean isSearching = true;
            char output = ' ';
            
            for(int i = 0; i < input.length() && isSearching; ++i)
            {
                if(table.containsKey(input.charAt(i)))
                {
                    output = input.charAt(i);
                    isSearching = false;
                }
                else
                {
                    table.put(input.charAt(i), 1);
                }
            }
            
            if(isSearching)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(output);
            }
        }
    }
}