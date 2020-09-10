//******************************************************************************
// Name: David Turnbough
// Date: January 6, 2018 Saturday
// Geeks for Geeks : Sorting Employees
// https://practice.geeksforgeeks.org/problems/sorting-employees/0
//******************************************************************************
package sorting.employees;

import java.util.Scanner;

public class SortingEmployees
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            Employee[] arr = new Employee[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = new Employee();
                arr[i].setName(in.next());
                arr[i].setSalary(in.nextInt());
            }

            in.nextLine();

            for (int h = 0; h < size; ++h)
            {
                for (int i = 0; i < size - 1; ++i)
                {
                    if (arr[i].getSalary() > arr[i + 1].getSalary())
                    {
                        Employee temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                    else if (arr[i].getSalary() == arr[i + 1].getSalary())
                    {
                        String firstName = arr[i].getName();
                        String secondName = arr[i + 1].getName();

                        if (firstName.compareTo(secondName) > 0)
                        {
                            Employee temp = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = temp;
                        }
                    }
                }
            }

            for (int i = 0; i < size; ++i)
            {
                arr[i].print();
            }

            System.out.println();

        }
    }

    public static class Employee
    {

        public String name = "";
        public int salary = 0;

        //**********************************************************************
        // constructors.
        //**********************************************************************
        Employee()
        {
            this.name = "";
            this.salary = 0;
        }

        Employee(String name, int salary)
        {
            this.name = name;
            this.salary = salary;
        }

        //**********************************************************************
        // getter methods.
        //**********************************************************************
        public String getName()
        {
            return this.name;
        }

        public int getSalary()
        {
            return this.salary;
        }

        //**********************************************************************
        // setter methods.
        //**********************************************************************
        public void setName(String name)
        {
            this.name = name;
        }

        public void setSalary(int salary)
        {
            this.salary = salary;
        }

        //**********************************************************************
        // other methods.
        //**********************************************************************
        public void print()
        {
            System.out.printf("%s %d ", this.name, this.salary);
        }
    }
}
