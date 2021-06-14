
//Problem Statement::
/*
Implement a program to handle Arithmetic exception, Array Index Out of Bounds.
The user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed.
If Num1 and Num2 are not integers, the program would throw a Number Format Exception.
If Num2 were zero, the program would throw an Arithmetic Exception. Display the exception.
*/

package assignment;
import java.util.Scanner;

class exception{
	
	void arthmaticException( ) {
		//method to check arthmaticException
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		boolean valid;
		valid=false;// intializing temp variable declaration
		while(!valid) {
		try {
			//try block
			System.out.println("Enter Two Numbers ::");
			int num1=sc.nextInt();//taking first num as input from user
			int num2=sc.nextInt();//taking second num as input from user
			double c=num1/num2;//dividing num1 by num2
			System.out.println("Division is "+c);//printing result
			valid=true;//changing value of temp variable
		}
		catch (Exception e) {
			//catch block  after exception occur
			System.out.println("\t\tCannot Divide by Zero \n\t\tEnter Valid Denominator....\n");
			//printing sentence when denominator is 0
		}
		}
		
	}
	void ArrayOutOfBound(int [] arr) {
		//method to check ArrayOutOfBound
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		boolean valid;
		valid=false;// intializing temp variable declaration
		while(!valid) {
		try {
			//try block
			System.out.print("\nEnter the Index No. of Element which you want to print ::");
			int i=sc.nextInt();//taking array index from user
			System.out.println( arr[i]+" is present at given index");
			//if index is there in array printing value at that index
			valid =true;//changing value of temp variable
		}
		catch(Exception e) {
			//catch block  after exception occur
			System.out.println(" \t\tInvalid Index try again...\n");
			//printing invalid index when index out of bound
		}
		
	}
	}

	void NumberFormat() {
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		boolean valid=false;// intializing temp variable declaration
		while(!valid) {
		
		try {
			//try block
			System.out.print("Enter first number:: ");
			String num1=sc.next();//taking first string as input from user
			System.out.print("Enter Second number:: ");
			String num2=sc.next();//taking first string as input from user
			int a=Integer.parseInt(num1);//converting string to integer
			int b=Integer.parseInt(num2);//converting string to integer
			System.out.println("\nEntered Numbers are integers::"+a+" , "+b);//printing both integer to console
			valid=true;//changing value of temp variable
			
		}
		catch(Exception e){
			//catch block  after exception occur
			System.out.println("\t\tNumbers You have Enter are not Integers \n\t\tPlease try again...\n");
			//printing when string is not converting to integer
		}
		
		}
	}
}
	
//======================= CLASS Main =======================//
public class Main {

	public static void main(String[] args) {
		//main method to start execution of program
		exception e=new exception();//creating object of exception class
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		int n;

		do {
			
			//menu driven
			System.out.println("\nEnter the Choice which you want to check type of error "
					          +"\n\t\t1] Arithmaticexception"
					          + "\t2] ArrayOutOfBound"
					          + "\n\t\t3] NumberFormat"
					          + "\t\t4] Exit");
			
			n=sc.nextInt();//taking input from user
			//switch case
			switch(n) {
			case 1:
				
				//when input is 1
				e.arthmaticException();//calling arthmaticException method
				System.out.println("==========================================================");
				break;
			case 2:
				//when input is 2
				int[] arr= {1,4,5,2,3,8};
				e.ArrayOutOfBound(arr);//calling ArrayOutOfBound method
				System.out.println("==========================================================");
				break;
			case 3:
				//when input is 3
				e.NumberFormat();//calling NumberFormat method
				System.out.println("==========================================================");
				break;
			case 4:
				//when input is 4
				n=0;//setting n->0
				System.out.println("==========================================================");
				break;
			default:
				//default when case is not found
				System.out.println("INVALID INPUT !!!");//printing when input is invalid
				System.out.println("==========================================================");
			}
			
			
			
		}while(n!=0);
		
	}

}


/*
 
 ##OUTPUT##


Enter the Choice which you want to check type of error 
		1] Arithmaticexception	2] ArrayOutOfBound
		3] NumberFormat		4] Exit
1
Enter Two Numbers ::
4
0
		Cannot Divide by Zero 
		Enter Valid Denominator....

Enter Two Numbers ::
5
2
Division is 2.0
==========================================================

Enter the Choice which you want to check type of error 
		1] Arithmaticexception	2] ArrayOutOfBound
		3] NumberFormat		4] Exit
2

Enter the Index No. of Element which you want to print ::56
		Invalid Index try again...


Enter the Index No. of Element which you want to print ::2
5 is present at given index
==========================================================

Enter the Choice which you want to check type of error 
		1] Arithmaticexception	2] ArrayOutOfBound
		3] NumberFormat		4] Exit
3
Enter first number:: 5
Enter Second number:: jk
		Numbers You have Enter are not Integers 
		Please try again...

Enter first number:: 6
Enter Second number:: 2

Entered Numbers are integers::6 , 2
==========================================================

Enter the Choice which you want to check type of error 
		1] Arithmaticexception	2] ArrayOutOfBound
		3] NumberFormat		4] Exit
4
==========================================================

*/
