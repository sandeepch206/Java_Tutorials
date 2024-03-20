package conditional_statements;

public class If_else_If_ladder {
	
	/*If_else_If_Ladder
	
	1. The if-else-if statement contains the if-statement followed by 
	multiple else-if statements.
	2. It is the chain of if-else statements and the program enters 
	the block of code if the condition is true.

	ex: if(Condition 1)
	{
		statement 1; //executes when condition 1 is true 
	}
	else if(Condition 2) {
		statement 2; //executes when condition 2 is true
	}
	else {
		statement 3; //executes when all the condition is false
	}*/

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		int day = 10;
		
		if(day == 1) 
		{
			System.out.println("Sunday");
		}
		else if (day == 2)
		{
			System.out.println("Monday");
		}
		else if (day == 3)
		{
			System.out.println("Tuesday");
		}
		else if (day == 4)
		{
			System.out.println("Wednsday");
		}
		else if (day == 5)
		{
			System.out.println("Thursday");
		}
		else if (day == 6)
		{
			System.out.println("Friday");
		}
		else if (day == 7)
		{
			System.out.println("Saturday");
		}
		
		else
		{
			System.out.println("Verify the day");
		}
		


		System.out.println("Program Ends");
	}

}
