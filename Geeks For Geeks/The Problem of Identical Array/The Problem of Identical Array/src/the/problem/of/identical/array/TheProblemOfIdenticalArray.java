//******************************************************************************
//******************************************************************************
package the.problem.of.identical.array;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class TheProblemOfIdenticalArray
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[] firstArray = new int[size];
            int[] secondArray = new int[size];

            for (int i = 0; i < size; ++i)
            {
                firstArray[i] = in.nextInt();
            }

            for (int i = 0; i < size; ++i)
            {
                secondArray[i] = in.nextInt();
            }

            sort(firstArray);
            sort(secondArray);

            int match = 1;
            
            for(int i = 0; i < size; ++i)
            {
                if(firstArray[i] != secondArray[i])
                {
                    match = 0;
                    break;
                }
            }

            System.out.printf("%d%n", match);

        }
    }
}
