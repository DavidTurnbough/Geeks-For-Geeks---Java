//***************************************************************************
// Name: David Turnbough
// Date: Thursday Septemeber 10, 2020
// Geeks For Geeks: Maximum Index
// https://practice.geeksforgeeks.org/problems/maximum-index/0
//***************************************************************************
import java.util.Scanner;

// Problem: Find the maximum difference in indexes (j - i) such that a[i] > a[j]
public class MaximumIndex
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int testCases = in.nextInt();

		while (testCases-- > 0)
		{
			int size = in.nextInt();
			int arr[] = new int[size];

			for (int i = 0; i < size; ++i)
			{
				arr[i] = in.nextInt();
			}

			int maximumDifference = 0;

			// Loops through the array until the end, or until the number of elements
			//	left in the array can not be larger than the maximum difference already
			//	found.
			for (int i = 0; i < size && (size - i > maximumDifference); ++i)
			{
				// Moves closer to the left index, or until smaller than the maximum
				//	difference already found.
				for (int j = size - 1; j > i && (j - i > maximumDifference); --j)
				{
					if (arr[i] <= arr[j])
					{
						if ((j - i) > maximumDifference)
						{
							maximumDifference = (j - i);
						}
					}
				}
			}

			System.out.printf("%d%n", maximumDifference);
		}
	}
}
