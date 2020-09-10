//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 26, 2018
// Geeks For Geeks: Trie | (Insert and Search)
// https://practice.geeksforgeeks.org/problems/trie-insert-and-search/0/?ref=self
//******************************************************************************
package trie.insert.and.search;

import java.util.Scanner;

public class TrieInsertAndSearch
{

    public static class Trie
    {

        private Trie[] children;
        public boolean isWord;

        Trie()
        {
            this.isWord = false;
            this.children = new Trie[26];
        }

        public void insert(String word)
        {
            if (word.isEmpty())
            {
                this.isWord = true;
                return;
            }

            char letter = word.charAt(0);
            int index = letter - 'a';

            if (this.children[index] == null)
            {
                this.children[index] = new Trie();
            }

            this.children[index].insert(word.substring(1));
        }

        public boolean isWord(String word)
        {
            if (word.isEmpty())
            {
                return this.isWord;
            }

            char letter = word.charAt(0);
            int index = letter - 'a';

            if (this.children[index] == null)
            {
                return false;
            }

            return this.children[index].isWord(word.substring(1));
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            int size = in.nextInt();
            in.nextLine();

            Trie myTrie = new Trie();

            for (int i = 0; i < size; ++i)
            {
                myTrie.insert(in.next());
            }
            
            in.nextLine();

            String keyWord = in.nextLine();

            System.out.printf("%d%n", myTrie.isWord(keyWord) ? 1 : 0);
        }
    }
}
