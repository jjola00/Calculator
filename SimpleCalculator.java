package ISE_Package;

import java.util.Scanner;
 
public class git_Calculator {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter 1 to add, 2 to multiply, 3 to exit.");
    	int operation = input.nextInt();
    	System.out.println("Enter first integer.");
    	int x = input.nextInt();
    	System.out.println("Enter second integer.");
    	int y = input.nextInt();
    	
    	if (operation == 1) {
    		int result = x + y;
    		System.out.println("The answer is " + result  );}
    	else if (operation == 2) {
    		int result = x * y;
    		System.out.println("The answer is " + result);}
    	else {System.out.println("Invalid input");}
    	//System.out.println(result);}
    
    	}
}