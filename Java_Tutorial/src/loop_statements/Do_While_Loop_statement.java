
package loop_statements;

public class Do_While_Loop_statement {
	
	/*While_Loop Statement
	
	1. The do-while loop checks the condition at the end of the loop 
	after executing the loop statements.
	2. When we have to execute the loop at least once,
 	we can use do-while loop.
 
	
	ex: do
		{
			statement
		}while(condition)
	*/
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		//print the value 1 to 10
		int i = 20;
		
		do 
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println("Program Ends");
	}
}
