//******************************************************************************
// Name: David Turnbough
// Date: Friday July 17, 2020
// Geeks For Geeks: Kth Smallest Element
// https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
//******************************************************************************
package kth.smallest.element;

import java.util.Scanner;

public class KthSmallestElement
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }

            int kthSmallest = in.nextInt();

            arr = quickSort(arr, 0, size - 1);

            System.out.printf("%d%n", arr[kthSmallest - 1]);
        }
    }

    public static int[] quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int partition = partition(arr, low, high);

            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }

        return arr;
    }

    public static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];
        int i = (low - 1); // index of smaller element 
        
        for (int j = low; j < high; j++)
        {
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
