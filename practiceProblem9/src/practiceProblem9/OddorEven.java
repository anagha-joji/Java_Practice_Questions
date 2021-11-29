package practiceProblem9;

import java.util.Scanner;

//class creation
public class OddorEven {

	public static void main(String[] args) {
		int num;
		
		//The input provided by user is stored in num
		Scanner sc = new Scanner(System.in); 
		num = sc.nextInt();
		sc.close();
		
		//if loop
		if(num % 2 == 0)
			System.out.println("Not Weird");
		else
			System.out.println("Weird");

	}

}
