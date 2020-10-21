// Name: David Turnbough
// Date: Wednesday October 21, 2020
// Geeks For Geeks: Winner of an Election
// https://practice.geeksforgeeks.org/problems/winner-of-an-election/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=2&query=problemStatusunsolvedproblemTypefulldifficulty[]0page2
package winner.of.an.election;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class WinnerOfAnElection
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            int numberOfVotes = Integer.parseInt(in.readLine());

            String[] votesCast = in.readLine().split(" ");

            HashMap<String, Integer> results = new HashMap<>();

            for (int i = 0; i < numberOfVotes; ++i)
            {
                int votesCastForCandidate = 0;

                if (results.containsKey(votesCast[i]))
                {
                    votesCastForCandidate = results.get(votesCast[i]) + 1;
                }
                else
                {
                    votesCastForCandidate++;
                }

                results.put(votesCast[i], votesCastForCandidate);
            }

            int maxVotes = 0;

            for (int i = 0; i < numberOfVotes; ++i)
            {
                if (results.get(votesCast[i]) > maxVotes)
                {
                    maxVotes = results.get(votesCast[i]);
                }
            }
            
            String winner = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
            
            for (String candidate : results.keySet())
            {
                if (results.get(candidate) == maxVotes && candidate.compareTo(winner) < 0)
                {
                    winner = candidate;
                }
            }
            
            System.out.printf("%s%n", winner);
        }
    }
}
