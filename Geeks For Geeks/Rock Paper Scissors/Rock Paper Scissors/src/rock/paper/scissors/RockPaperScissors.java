//******************************************************************************
// Name: David Turnbough
// Date: Monday August 6, 2018
// Geeks for Geeks: Rock Paper Scissors
// https://practice.geeksforgeeks.org/problems/rock-paper-scissors/0
//******************************************************************************
package rock.paper.scissors;

import java.util.Scanner;

public class RockPaperScissors
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String winner = "A";

            String game = in.nextLine();

            if (game.charAt(0) == game.charAt(1))
            {
                winner = "DRAW";
            }
            else if (game.charAt(0) == 'S' && game.charAt(1) == 'R'
                    || game.charAt(0) == 'R' && game.charAt(1) == 'P'
                    || game.charAt(0) == 'P' && game.charAt(1) == 'S')
            {
                winner = "B";
            }

            System.out.printf("%s%n", winner);
        }
    }
}
