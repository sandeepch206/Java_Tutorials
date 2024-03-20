package loop_statements;

public class While_Loop {
	
	/*While_Loop Statement
	
	1. The while loop is used to iterate over the number of statements
	multiple times.
	2. If the condition is true, then the loop body will be executed; 
	otherwise, the statements after the loop will be executed. 
	
	ex: while(Condition)
		{
			looping statements 
		}
	*/

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//print the value 1 to 10
		int i = 8;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("Program Ends");
	}

}
