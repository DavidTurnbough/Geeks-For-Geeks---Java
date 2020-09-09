package count.nodes.of.linked.list.function.problem;
//******************************************************************************
// Name: David Turnbough
// Date: January 4, 2018 Thursday
// Geeks for Geeks: Count Nodes of Linked List (Function Problem)
// https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
//******************************************************************************

public class CountNodesOfLinkedListFunctionProblem
{
    static void main(String args[])
    {
        // unused.
        // this test is only designed to test the getCount function
    }
    

    public int getCount(Node head)
    {
        int total = 0;

        while(head != null)
        {
            total++;
            head = head.next;
        }
        
        return total;
    }

}
