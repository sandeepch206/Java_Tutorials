package conditional_statements;

public class Nested_If_Statement {
	/*Nested_If_Ladder
	
	1.  In nested if-statements, the if statement 
	can contain a if or if-else statement.

	ex: if(Condition 1)
	{
		statement 1; //executes when condition 1 is true
		 
			if(Condition 2) {
				statement 2; //executes when condition 2 is true
			}
			else {
				statement 3; //executes when condition 2 is false
			}
	}*/

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		int a = 10;
		int b = 30;
		int c = 50;
		int d = 80;
		
		if(a==10)
		{
			System.out.println(a);
			if(b==30)
				{
					System.out.println(b);
				}
				if(c==50)
					{
						System.out.println(c);
					}
				if(d==80)
				{
					System.out.println(d);
				}
		}
		
		System.out.println("Program Ends");
	}

}
