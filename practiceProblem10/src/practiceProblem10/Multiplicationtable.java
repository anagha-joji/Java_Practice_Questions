package practiceProblem10;

import java.util.Scanner;

//class creation
public class Multiplicationtable {

	public static void main(String[] args) {
		
		//The input provided by user is stored in n
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter number:");        
		 int n=s.nextInt();
		 s.close();
		 
		 //loop of multiplication logic
		 for(int i=1; i <= 10; i++)
			 System.out.println(n+" * "+i+" = "+n*i);
		 }

}
