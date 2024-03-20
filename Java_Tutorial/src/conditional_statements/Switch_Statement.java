package conditional_statements;

public class Switch_Statement {
	/*Switch_Statement
	
	1.  Switch statements are similar to if-else-if statements.
	2. The switch statement contains multiple blocks of code called cases and a 
	single case is executed based on the variable passed in switch statement.
	3. The switch statement is easier to use instead of if-else-if statements.
	4. It also enhances the readability of the program.
	
	Note
	1. Cases cannot be duplicate.
	2. Default statement is executed when any of the case doesn't match 
	the value of expression. It is optional.
	3. Break statement terminates the switch block when the condition
	is satisfied. It is optional, if not used, next case is executed.

	ex: switch (expression) { 
			case value1: statement1; 
					 	 break; 
			case valueN: statementN; 
						 break; 
			default: default statement; 
		}*/
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		int day = 4
				;
		
		switch(day)
		{
			case 1: System.out.println("Sunday");
					break;
			case 2: System.out.println("Monday");
					break;
			case 3: System.out.println("Tuesday");
					break;
			case 4: System.out.println("Wednsday");
					break;
			case 5: System.out.println("Thursday");
					break;
			case 6: System.out.println("Friday");
					break;
			case 7: System.out.println("Saturday");
					break;
			default: System.out.println("Verify the day");
		}
		System.out.println("Program Ends");
	}

}
