package loop_statements;

public class For_Loop {
	
	/*For_Loop Statement
	
	1. It enables us to initialize the loop variable, check the condition,
		and increment/decrement in a single line of code.

	ex: for(initialization; condition; increment/decrement) 
		{ 
			//block of statements 
		}
	*/

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		for(int i=1; i<=5; i++)
			{
				System.out.println(i);
			}
		
		System.out.println("Program Ends");
	}

}
