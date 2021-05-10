/**
 * Name: David Turnbough
 * Date: Monday May 10, 2021
 * Geeks For Geeks: Geek And His Marks
 * https://practice.geeksforgeeks.org/problems/geek-and-his-marks-1611824243/0/?problemStatus=unsolved&problemType=full&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-2difficulty[]-1difficulty[]0page1
 */
package geek.and.his.marks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GeekAndHisMarks
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int rawInput[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            int classSize = rawInput[0];
            int mark = rawInput[1];
            
            int[] students = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            int betterGrades = 0;
            
            for(int i = 0; i < classSize; ++i)
            {
                if(students[i] > mark)
                {
                    betterGrades++;
                }
            }
            
            System.out.printf("%d%n", betterGrades);
        }
    }
}
