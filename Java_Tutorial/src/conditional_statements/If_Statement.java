package conditional_statements;

public class If_Statement {
	
	/*Simple If Statement
	1. It is the most basic statement among all control flow statements 
	in Java.
	2. It enables the program to enter a block of code if the condition 
	is true.
	
	Ex: if(Condition)
	{
		statement 1; //executes when condition is true 
	}*/

	

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		int age = 17;
		
		if(age >= 18)
		{
			System.out.println("Right to Vote");
		}
		
		System.out.println("Program Ends");
	}

}
