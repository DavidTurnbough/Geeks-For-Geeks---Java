//******************************************************************************
// Name: David Turnbough
// Date: Tuesday July 17, 2018
// Geeks for Geeks: Doctors Clinic
// https://practice.geeksforgeeks.org/problems/doctors-clinic/0
//******************************************************************************
package doctors.clinic;

import java.util.Scanner;

public class DoctorsClinic
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int numberOfPatients = in.nextInt();
            int interval = in.nextInt();

            System.out.printf("%d%n", (numberOfPatients - 1) * (10 - interval));
        }
    }
}
