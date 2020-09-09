//******************************************************************************
// Name: David Turnbough
// Date: Monday, March 11, 2019
// Class: CSCE 4133 - Algorithms
// Assignment: Homework #5
//******************************************************************************
package homework5;

import java.util.Arrays;
import java.util.Random;

public class Homework5
{

    //**********************************************************************
    // Variable Declerations.
    //**********************************************************************
    private static final int ADDITIONAL_VALUES = 50;
    private static final int INITIAL_SIZE = 900;
    private static final int FINAL_SIZE = 1009;
    private static final int CONSTANT1 = 1;
    private static final int CONSTANT2 = 3;

    private static int[] seedValues = new int[FINAL_SIZE];
    private static int[] additionalValues = new int[ADDITIONAL_VALUES];
    private static int[] hashTable1 = new int[FINAL_SIZE];
    private static int[] hashTable2 = new int[FINAL_SIZE];
    private static int[] hashTable3 = new int[FINAL_SIZE];
    private static int linearProbingCollisions = 0;
    private static int quadraticProbingCollisions = 0;
    private static int doubleHashProbingCollisions = 0;

    //**************************************************************************
    // Hash Functions.
    //**************************************************************************
    public static int hashFunction1(int input)
    {
        return input;
    }

    public static int hashFunction2(int input)
    {
        return (1 + (input % (FINAL_SIZE - 1)));
    }

    //**************************************************************************
    // Probing functions.
    //**************************************************************************
    public static void linearHash(int[] hashValue, int size)
    {
        for (int i = 0; i < size; ++i)
        {
            int hash = hashFunction1(hashValue[i]);

            for (int j = 0; j < size && j != hash; ++j)
            {
                int index = (hash + j) % FINAL_SIZE;

                if (hashTable1[index] > 0)
                {
                    linearProbingCollisions++;
                }
                else
                {
                    hashTable1[index] = hashValue[i];
                    break;
                }
            }
        }
    }

    public static void quadraticHash(int[] hashValue, int size)
    {
        for (int i = 0; i < size; ++i)
        {
            int hash = hashFunction1(hashValue[i]);

            for (int j = 0; j < size; ++j)
            {
                int index = (hash + (CONSTANT1 * j) + (CONSTANT2 * j * j)) % FINAL_SIZE;
                if (hashTable2[index] > 0)
                {
                    quadraticProbingCollisions++;
                }
                else
                {
                    hashTable2[index] = hashValue[i];
                    break;
                }
            }
        }
    }

    public static void doubleHash(int[] hashValue, int size)
    {
        for(int i = 0; i < size; ++i)
        {
            int hash1 = hashFunction1(hashValue[i]);
            int hash2 = hashFunction2(hashValue[i]);
            
            for(int j = 0; j < size && j != hash1; ++j)
            {
                int index = (hash1 + j * hash2) % FINAL_SIZE;
                if(hashTable3[index] > 0)
                {
                    doubleHashProbingCollisions++;
                }
                else
                {
                    hashTable3[index] = hashValue[i];
                    break;
                }
            }
        }
    }

    // Generate unique random values to insert into the hash tables. 
    public static void initializeSeedValues(int[] hashTable, int size)
    {
        for (int i = 0; i < size; ++i)
        {
            int randomNumber = new Random().nextInt(Integer.MAX_VALUE);
            hashTable[i] = randomNumber;

            for (int j = 0; j < i; j++)
            {
                if (hashTable[i] == hashTable[j])
                {
                    i--;
                    break;
                }
            }
        }
    }

    // Print the number of collisions for each hash scheme.
    public static void printResults(int linearProbingCollisions, int quadraticProbingCollisions, int doubleHashProbingCollisions)
    {
        System.out.printf("Linear Probing Collisions : %d%n"
                + "Quadratic Probing Collisions : %d%n"
                + "Double Hasing Collisions : %d%n",
                linearProbingCollisions, quadraticProbingCollisions, doubleHashProbingCollisions);
    }

    //**************************************************************************
    // Main Method.
    //**************************************************************************
    public static void main(String[] args)
    {
        // Initializing all array elements to -1.
        Arrays.fill(seedValues, -1);
        Arrays.fill(additionalValues, -1);
        Arrays.fill(hashTable1, -1);
        Arrays.fill(hashTable2, -1);
        Arrays.fill(hashTable3, -1);

        // Initialize seed values.
        initializeSeedValues(seedValues, FINAL_SIZE);
        additionalValues = Arrays.copyOfRange(seedValues, INITIAL_SIZE + 1, FINAL_SIZE);

        // Insert initial seed values.
        linearHash(seedValues, INITIAL_SIZE);
        quadraticHash(seedValues, INITIAL_SIZE);
        doubleHash(seedValues, INITIAL_SIZE);

        // Inserted additional Values.
        linearHash(additionalValues, ADDITIONAL_VALUES);
        quadraticHash(additionalValues, ADDITIONAL_VALUES);
        doubleHash(additionalValues, ADDITIONAL_VALUES);

        // Print the number of collisions. 
        printResults(linearProbingCollisions, quadraticProbingCollisions, doubleHashProbingCollisions);
    }
}
