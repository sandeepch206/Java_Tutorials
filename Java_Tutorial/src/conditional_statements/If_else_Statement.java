package conditional_statements;

public class If_else_Statement {
	
	/*If_else_Statement
	
	1. The if-else statement is an extension to the if-statement,
	which uses another block of code, i.e., else block.
	2. The else block is executed if the condition of the 
	if-block is false
	
	ex: if(Condition)
	{
		statement 1; //executes when condition is true 
	}
	else {
		statement 2; //executes when condition is false
	}*/
	
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		int age = 16;
		
		if(age >= 18)
		{
			System.out.println("Right to Vote");
		}
		else 
		{
			System.out.println("No Right to Vote");
		}
		
		System.out.println("Program Ends");
		
		
	}

}
