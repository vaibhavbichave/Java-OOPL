
//Problem Statement::
/*
  design a base class shape with two double type values and member function to 
  input the data and compute area() for calculating area of shape. Derive two classes 
  Triangle and Rectangle make compute area() as abstract function and redefine this function 
  in the derive class to suit their requirement .Write a program that accepts the dimension 
  of Triangle /Rectangle and display calculated area. Implement dynamic binding.
  */

package assignment;
import java.util.*;
abstract class shape {
	
	private double dimen1,dimen2;		//private data members
	
	double getDimen1()		//method to return dimension 1
	{
		return dimen1;
	}
	
	double getDimen2()		//method to return dimension 2
	{
		return dimen2;
	}
	
	shape(){};				//default constructor
	
	shape(double a,double b)	//parameterized constructor
	{
		dimen1=a;
		dimen2=b;
	}
	
	abstract double compute_area();		//abstract method to calculate area

	void read()				//method to take dimensions as input from user
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER  FIRST  DIMENSION :  ");
		dimen1=sc.nextDouble();		//read dimension 1 from user
		System.out.print("ENTER SECOND  DIMENSION :  ");
		dimen2=sc.nextDouble();		//read dimension 2 from user
	}
	
}

//======================= CLASS triangle =======================//
class triangle extends shape{
	
	double area;		
	
	triangle(){}		//default constructor
	
	triangle(double base, double height)		//parameterized constructor
	{
		super(base,height);		//call to parameterized constructor of shape class
	}
	
	 double compute_area()		// method to calculate and return area of 
	{
		 area=(getDimen1()*getDimen2())/2;
		 return area;
	}
}


//======================= CLASS rectangle =======================//
class rectangle extends shape {
	
	double area;
	
	rectangle(){}			//default constructor
	
	rectangle (double length, double breadth)		//parameterized constructor
	{
		super(length,breadth);		//call to parameterized constructor of shape class
	}
	
	 double compute_area()			// method to calculate and return area of rectangle
	{
		 area=(getDimen1()*getDimen2());
		 return area;
	} 
}


//======================= CLASS Main =======================//
public class Main {
		
	public static void main(String args[])		//main method
	{
		Scanner sc=new Scanner(System.in);	
			
		int x;			//switch case variable
		shape s;		//reference variable of super class shape
		do {
			System.out.print("\n\t  MENU\n\t1.Triangle\n\t2.Rectangle \n\t3.Exit\n\tChoice ::");
		
			x=sc.nextInt();
			System.out.println();
			switch(x)
			{
			case 1:			//area of triangle by parameterized constructor		
				
				double a,b;
				System.out.print("ENTER BASE OF TRIANGLE:  ");				
				a=sc.nextDouble();		//read dimension 1 from user
				System.out.print("ENTER HEIGHT OF TRIANGLE:  ");
				b=sc.nextDouble();		//read dimension 2 from user
				
				triangle t= new triangle(a,b);	
				//reference variable of shape and object type of triangle 
				s=t;
				System.out.println("AREA OF TRIANGLE IS  :  "+ s.compute_area());		
				//displaying area of triangle
				System.out.println("=======================================================");
				break;
				
				
			case 2:		//area of rectangle by default constructor
				
				rectangle r= new rectangle();					
				//reference variable of shape and object type of rectangle class
				s=r;
				s.read();		//call to read function
				System.out.println("AREA OF RECTANGLE IS  :  "+ s.compute_area());
				System.out.println("=======================================================");
				break;
		
				
			case 3:			//Exited 
				System.out.println("   EXITED SUCCESSFULLY  ");
				System.out.println("=======================================================");
				break;
				
				
			default:		//default case
				System.out.println("  INVALID  INPUT  ");
				System.out.println("=======================================================");
				
			}
		}while(x!=3);	//loop breaks when input x=3
		
		sc.close();		//closing of scanner class
	}
}
//=================================================================================================//



/*
##OUTPUT##

	  MENU
	1.Triangle
	2.Rectangle 
	3.Exit
	Choice ::1

ENTER BASE OF TRIANGLE:  5.2
ENTER HEIGHT OF TRIANGLE:  6.6
AREA OF TRIANGLE IS  :  17.16
=======================================================

	  MENU
	1.Triangle
	2.Rectangle 
	3.Exit
	Choice ::2

ENTER  FIRST  DIMENSION :  2.0
ENTER SECOND  DIMENSION :  9.7
AREA OF RECTANGLE IS  :  19.4
=======================================================

	  MENU
	1.Triangle
	2.Rectangle 
	3.Exit
	Choice ::5

  INVALID  INPUT  
=======================================================

	  MENU
	1.Triangle
	2.Rectangle 
	3.Exit
	Choice ::3

   EXITED SUCCESSFULLY  
=======================================================

*/
