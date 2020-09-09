//******************************************************************************
// Name: David Turnbough
// Date:
// Geeks For Geeks:
// https://practice.geeksforgeeks.org/problems/camelcase-pattern-matching/0
//******************************************************************************
package camelcase.pattern.matching;

import java.util.Scanner;

public class CamelCasePatternMatching
{
    public class Trie
    {
        boolean isLeaf;
        Trie[] children;
        
        Trie()
        {
            isLeaf = false;
            children = new Trie[26];
        }
        
        public void insert(String word)
        {
            if(word.isEmpty())
            {
                isLeaf = true;
                return;
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = 1;
        
        while(testCases-- > 0)
        {

        }
    }
}