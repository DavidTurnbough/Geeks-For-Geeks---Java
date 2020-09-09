package equal.to.product;
//******************************************************************************
// Name: David
// Date: Thursday April 26, 2018
// Geeks For Geeks
// https://practice.geeksforgeeks.org/problems/equal-to-product/0
//******************************************************************************

import java.util.Scanner;

public class EqualToProduct
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            boolean productFound = false;
            int size = in.nextInt();
            int product = in.nextInt();
            int[] values = new int[size];

            for (int i = 0; i < size; ++i)
            {
                values[i] = in.nextInt();
            }

            for (int i = 0; i < size && !productFound; ++i)
            {
                for (int j = i; j < size && !productFound; ++j)
                {
                    if (values[i] * values[j] == product)
                    {
                        productFound = true;
                        break;
                    }
                }
            }

            if (productFound)
            {
                System.out.printf("%s%n", "Yes");
            }
            else
            {
                System.out.printf("%s%n", "No");
            }

        }
    }
}
