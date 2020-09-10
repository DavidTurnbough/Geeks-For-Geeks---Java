import java.util.Scanner;

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

			for (int i = 0; i < size && (size - i > maximumDifference); ++i)
			{
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
