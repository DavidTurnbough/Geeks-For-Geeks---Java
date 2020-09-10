//******************************************************************************
// Name: David Turnbough
// Date: January 8, 2018 Monday
// Geeks for Geeks: Print Linked List Elements (Function Problem)
// https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1
//******************************************************************************
package print.linked.list.elements.function.problem;

public class PrintLinkedListElementsFunctionProblem
{

    public static void main(String[] args)
    {
    }

    public class Node
    {
        public int data;
        public Node next;
        
        Node()
        {
            this.data = 0;
            this.next = null;
        }
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
        
        
    }
    
    public class List
    {
        public int size;
        public Node head;
        
        List()
        {
            this.size = 0;
            this.head = null;
        }
        
        void add()
        {
            
        }
        
        void printList(Node head)
        {
            Node temp = head;
            
            while(temp != null)
            {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            }
        }
        
    }
}
