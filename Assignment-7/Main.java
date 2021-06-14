
//Problem Statement::
/*Implement a generic program using any collection class to count the number of 
 * element in a collection that have a specific property such as even number,
 *  odd number, prime number and pallindromes.*/ 


package assignment;
import java.util.Objects;
import java.util.Scanner;

class Number{

//=========================================== Array Method ===========================================//
	
	public static < E > void arr( ) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter size of array:: ");
		int n=sc.nextInt();//taking size of array from user

		Object[] arr=new Object[n]; //creating array of size n

		System.out.print("Enter Array Elements :: ");
		for(int i =0; i<n ;i++) {
			arr[i]=sc.next();// taking array element from user
		}

		System.out.print("Entered Array is :: ");
	      	for(Object element : arr) {
	        		System.out.printf("'%s' ", element); //printing array element on console
	        }

	        System.out.println();// printing blank line
	 }

//======================================== Pallindrome Method ========================================//

	public static < T > void Pallindrome(T s){
		String s1=(String)s; 
		//converting s into string datatype
		s1=s1.toLowerCase();
		//converting into lowercase letter
		StringBuffer sb = new StringBuffer(s1); 
		// creating stringbuffer 

		String ss= new String(sb.reverse());
		//reversing stringbuffer and converting into string

		if(Objects.equals(s1, ss))	//checking both strings are equal or not
			System.out.println(s+" is Pallindrome");//if both string are equal
		else
			System.out.println(s+" is not Pallindrome");//if both string are different
	}



//========================================= EVEN ODD method =========================================//

	public static <T>void evenodd(T a){
		if((int)a%2==0)	//converting a into int and modulo by 2
			System.out.println(a+" is Even Number."); //if num is even

		else
			System.out.println(a+" is Odd Number."); //if num is odd
	}

//========================================= PRIME METHOD =========================================//	

	public static <T>void prime(T a) {
		if((int)a==1)	//check if a = 1
			System.out.println(a+" is Not Prime NNumber");

		else if ((int)a==2) //check if a = 2
			System.out.println(a+" is Prime Number");

		else if((int)a%2==0 && (int)a>2) //check if a >2 and a mod 2 =0
			System.out.println(a+" is Not Prime Number");

		else {
			double b=Math.sqrt((int)a)+1; //taking squareroot of (num) +1
			int temp=0; // setting temp variable = 0
			for(int i=3;i<b;i=i+2) {
				if((int)a%i==0) // check if mod = 0
					temp=1; //setting temp to 1
			}
			if(temp==1) // checking temp = 1 or not
				System.out.println(a+" is Not Prime Number");//if temp =1 
			else
				System.out.println(a+" is Prime NNumber");// if temp!= 1
		}
			
	}


//====================================== CHECK FUNCTION METHOD ======================================//

	public static <T>void checkfun(T s) {
		
		try {
			//try block
			int b = Integer.parseInt((String) s);
			// try to convert "s" into integer datatype
			System.out.println("We can perform Pallindrome , int Array , check Prime , EvenOdd Function."); 
			// if successfully converted, print rest of code
		}

		catch (NumberFormatException e) {
			//catch block
			// catch NumberFormateException
			System.out.println("We can perform Pallindrome , String Array.");
		}
	}
}



//========================================= MAIN CLASS =========================================//

public class Main {

	public static void main(String[] args) {
		String s; // declaring s as string
		Scanner sc =new Scanner(System.in); // creting object of scanner class

		aa: //loop aa
		while(true) {	//while loop 
		System.out.println("\n\t==== MENU BAR ====\n\n\t1.String \n\t2.Integer"
				+ "\n\t3.integer array \n\t4.String Array"
				+ "\n\t5.Check Function\n\t6.Exit");
		//menu bar

		int c =sc.nextInt();//taking input from user


		switch(c) {// switch cases

		case 1:	//if input is 1
			System.out.print("Enter the String :: ");//printing on console
			s =sc.next();//taking String s as an input from user
			Number.Pallindrome(s); //calling Pallindrome method
			System.out.println("======================================================");
			break;

		case 2: //if input is 2
			System.out.print("Enter the Integer :: ");//printing on console
			s =sc.next();//taking String s as an input from user
			Number.Pallindrome(s); //calling Pallindrome method
			Number.evenodd(Integer.parseInt(s)); //calling Even Odd method
			Number.prime(Integer.parseInt(s)); //calling prime method
			System.out.println("======================================================");
			break;

		
		case 3: //if input is 3

		case 4: //if input is 4
			Number.arr();//array method
			System.out.println("======================================================");
			break;
			
		case 5: //if input is 5
			System.out.print("Enter the String :: ");//printing on console
			String ss =sc.next();//taking String ss as an input from user
			Number.checkfun(ss); //calling check function method
			System.out.println("======================================================");
			break;

		case 6: //if input is 6
			System.out.println("======================================================");
			break aa; // break aa loop, stop execution of program

		default: //default Statement
			System.out.println("Invalid Input !!!"); //printing invalid input on console
			System.out.println("======================================================");
			
		}
	}
	}

}


/*
 
 ##OUTPUT##
 

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
1
Enter the String :: Madam
Madam is Pallindrome
======================================================

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
1
Enter the String :: Student
Student is not Pallindrome
======================================================

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
2
Enter the Integer :: 1234321
1234321 is Pallindrome
1234321 is Odd Number.
1234321 is Not Prime Number
======================================================

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
2
Enter the Integer :: 2
2 is Pallindrome
2 is Even Number.
2 is Prime Number
======================================================

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
3
Enter size of array:: 4
Enter Array Elements :: 4 6 2 8
Entered Array is :: '4' '6' '2' '8' 
======================================================

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
4
Enter size of array:: 6
Enter Array Elements :: ads xd gxdfh fgxdg gdc hfh
Entered Array is :: 'ads' 'xd' 'gxdfh' 'fgxdg' 'gdc' 'hfh' 
======================================================

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
5
Enter the String :: 2446
We can perform Pallindrome , int Array , check Prime , EvenOdd Function.
======================================================

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
5
Enter the String :: parent
We can perform Pallindrome , String Array.
======================================================

	==== MENU BAR ====

	1.String 
	2.Integer
	3.integer array 
	4.String Array
	5.Check Function
	6.Exit
6
======================================================

*/
