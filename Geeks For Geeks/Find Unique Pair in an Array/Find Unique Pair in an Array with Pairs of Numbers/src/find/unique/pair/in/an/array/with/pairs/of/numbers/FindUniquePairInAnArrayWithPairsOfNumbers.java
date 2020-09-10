//******************************************************************************
// Name: David Turnbough
// Date: January 12, 2018 Friday
// Geeks for Geeks: Find Unique Pair in an Array with Pairs of Numbers
// https://practice.geeksforgeeks.org/problems/find-unique-pair-in-an-array-with-pairs-of-numbers/0
//******************************************************************************
package find.unique.pair.in.an.array.with.pairs.of.numbers;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class FindUniquePairInAnArrayWithPairsOfNumbers
{

    public static final int MAX_VALUE = 99999;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0)
        {
            int size = sc.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = sc.nextInt();
            }

            sort(arr);

            int firstUnique = MAX_VALUE;
            int secondUnique = MAX_VALUE;

            for (int i = 0; i < size; ++i)
            {
                boolean isUnique = true;

                for (int j = 0; j < size; ++j)
                {
                    if (i != j && arr[i] == arr[j])
                    {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique)
                {
                    if (firstUnique == MAX_VALUE)
                    {
                        firstUnique = arr[i];
                    }
                    else
                    {
                        secondUnique = arr[i];
                        break;
                    }
                }
            }

            System.out.printf("%d %d%n", firstUnique, secondUnique);
        }
    }
}
