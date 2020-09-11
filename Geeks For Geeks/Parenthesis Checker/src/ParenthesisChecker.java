import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParenthesisChecker
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());

		while (testCases-- > 0)
		{
			String input = br.readLine();
			
			Stack<String> stk = new Stack<String>();

			for (int i = 0; i < input.length(); ++i)
			{
				// Get the current chracter from the string of braces
				String currentChar = String.valueOf(input.charAt(i));
				
				// Make sure the stack is not empty, otherwise throws an error for trying to peek at empty stack.
				// Checks to see if the current character is the matching closing brace for the last brace.
				if (!stk.isEmpty() && (currentChar.equals("}") && stk.peek().equals("{") || currentChar.equals(")") && stk.peek().equals("(")
						|| currentChar.equals("]") && stk.peek().equals("[")))
				{
					stk.pop();
				} 
				else
				{
					stk.push(currentChar);
				}
			} // end for loop

			System.out.print(stk.isEmpty() ? "balanced" : "not balanced");
			System.out.println();
		} // end while loop
	}
}
