//******************************************************************************
// Name: David Turnbough
// Date: Thursday February 13, 2020
// Geeks For Geeks: Excel Sheet Part - 1
// https://practice.geeksforgeeks.org/problems/excel-sheet/0
//******************************************************************************
package excel.sheet.part.pkg1;

import java.util.Scanner;

public class ExcelSheetPart1
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int input = in.nextInt();

            String output = "";

            int temp = 0;
            
            while (input > 0)
            {
                if(input >= 26)
                {
                    temp = (input / 26) + 64;
                    input = input % 26;
                }
                else if(input < 26)
                {
                    temp = input + 64;
                    input = 0;
                }
                
                output += (char)temp;
                
                System.out.printf("%s%n", output);
            }

            System.out.printf("%s%n", output);
        }
    }
}
