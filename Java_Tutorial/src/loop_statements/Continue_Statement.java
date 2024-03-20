
package loop_statements;

public class Continue_Statement {
	
	/*Break_Statement
	
	1. Unlike break statement, the continue statement doesn't break the loop.
	2. Whereas, it skips the specific part of the loop and jumps to the next iteration 
		of the loop immediately.
	}*/

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		for(int i=1; i<=20; i++)
			{
				if(i==10)
				{
					continue;
				}
			System.out.println(i);
			}
		System.out.println("Program Ends");
		
	}

}
