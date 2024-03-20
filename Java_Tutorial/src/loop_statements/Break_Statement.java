
package loop_statements;

public class Break_Statement {
	
	/*Break_Statement
	
	1. The break statement is used to break the current flow of the program and 
		transfer the control to the next statement outside a loop or switch statement.
	2. However, it breaks only the inner loop in the case of the nested loop.
	3. The break statement cannot be used independently in the Java program, i.e., 
		it can only be written inside the loop or switch statement.
	}*/

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		for(int i=1; i<=10; i++)
			{
				if(i==10)
				{
					break;
				}
			System.out.println(i);
			}
		System.out.println("Program Ends");
	}

}
