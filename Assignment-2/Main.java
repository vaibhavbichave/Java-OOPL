
//Problem Statement::
/*
Identify commonalities and differences between Publication, Book and Magazine classes. 
Title, Price, Copies are common instance variables and saleCopy is common method.
The differences are, Bookclass has author and orderCopies().
Magazine Class has data members as orderQty, Current issue and method receiveNewissue().Write a program 
to find how many copies of the given books are ordered and display total sale of publication.
*/


package assignment;
import java.util.*;

class publication {
	//private data members
	private  String title;
	private int price;
	private  int copies;
	private int total;

	
	Scanner sc=new Scanner(System.in);//scanner class object
		
	public void settitle(String title) {			
		//setter method for title
		this.title=title;
	}
	

	public void setcopies(int copies) {			
		//setter method for copies
		this.copies=copies;
	}
	
	
	public String gettitle() {			
		//getter method for title
		return title;
	}
	
	public int getTotal() {	
		//getter method for price
		return total;
	}
	
	public int getCopies() {			
		//getter method for copies
		return copies;
	}
	
	public int getprice() {
		return price;
	}
	

	void read_publ() {				
		//read or input method for common data members of magazine and book class
				
		System.out.print("enter title : ");
		title=sc.next();
		System.out.print("enter price:  ");
		price=sc.nextInt();
		System.out.print("enter copies: ");
		copies=sc.nextInt();
	}
	
	void display() {						
		//display method for common data members of book and magazine class
		
		System.out.print(title+"\t"+price+"\t"+copies);
	}
	
	
	
	void sale_copy(int number) {			
		//common method to sale book or magazine and generate bill
		if (number <= copies)		
		//if customer needed copies are less than available
		{
			copies=copies-number;
			total=total + number*price;
			System.out.println("\tYOU PURCHASED  "+number +"  COPIES \n\tYOU HAVE TO PAY :  "+(price*number));
		}
		else			//if customer needs copies more than available in stock
			System.out.println("     INSUFFICIENT STOCK!!!!!!!!!");
	}

}

//======================= CLASS book =======================//
class book extends publication {
	
	 private String author;		
	 //data member of book class only

	        
	void order_copies(int number) {		//increase available copies of book by ordering 
		int x=getCopies()+number;
		setcopies(getCopies()+number);		
		//as data members are private, we access them with the help of methods
		System.out.println("\n\tORDER SUCESSFUL....");
		System.out.println("\tCOPIES AVAILABLE : "+x);
	}
	
	void read_book() {			
		//method calling read method of publication class and also reading author
		read_publ();
		System.out.print("enter author book: ");
		author=sc.next();
	}
	
	void display_book(){
		System.out.println("title \tprice \tcopy \tauthor");
		display();//call to display defined in publication class
		System.out.println("\t"+author);
	}
}


//======================= CLASS magazine =======================//
class magazine extends publication{			
	//magazine class is inherited from publication
	
	private int order_qty;	//data members
	private String issue_date;
	
	void receive_issue(String new_issue_date) {		
		//method to issue new or upgraded magazine
		System.out.println("ENTER NEW COPIES ORDERED: ");
		order_qty=sc.nextInt();			
	
		setcopies(order_qty);		
		//setting values to copies by setter method
		
		issue_date=new_issue_date;
		System.out.println("\tTHE MAGAZINE "+gettitle()+" \n\t WITH ISSUE DATE "+issue_date+"AVAILABLE");
	}
	
	void read_mag() {		//method to read or input magazine details
		read_publ();		//call to read method defined in publication class
		System.out.print("Enter THe Current Issue Date [dd/mm/yyyy]");
		issue_date=sc.next();
	}
	
	void display_mag() {		//display method to display 
		System.out.println("title \tprice \tcopy \tdate");
		display();
		System.out.println("\t"+issue_date);
	}
}

//======================= CLASS Main =======================//
public class Main {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		book b=new book();
		magazine m=new magazine();
		
	int outer;	
	do {
		
			System.out.println("\n\n\tCHOOSE ONE OF THE FOLLOWING....\n\n\t1.BOOK \t\t\t2.MAGAZINE"
					+ "\n\n\t3.TOTAL SALE AMOUNT\t4.REVENUE OF PUBLICATION\n\n");
			System.out.print("Choice::");
			int k=sc.nextInt();
			int a;
			aa:
				
			if(k==1) {
				
				
				do {
				int c;
				System.out.print("\n\t\tMENU   FOR   BOOK\n");
				System.out.print("\t1.read book \t\t2.display \n\t3.sale copies \t\t4.order copies");
				System.out.print("\n\tChoice::");
				c=sc.nextInt();
				switch (c){
				
				case 1:
					System.out.println("==============================================================================\n");
					b.read_book();
					System.out.println("==============================================================================\n");
					break;
				case 2:
					System.out.println("==============================================================================\n");
					b.display_book();
					System.out.println("==============================================================================\n");
					break;
				case 3:
					System.out.println("==============================================================================\n");
					System.out.print("HOW MANY COPIES YOU(for customer) WANT : ");
					int n1=sc.nextInt();
					b.sale_copy(n1);
					System.out.println("==============================================================================\n");
					break;
				case 4:
					System.out.println("==============================================================================\n");
					System.out.print("ENTER COPIES WANT TO ORDER(for shop): ");
					int n2=sc.nextInt();
					b.order_copies(n2);
					System.out.println("==============================================================================\n");
					break;
				default:
					System.out.println("invalid");
					
				}
				System.out.println("Do you want to continue with book section[1/0]\n\t1.YES \t\t0.NO");
				System.out.print("\tChoice::");
				a=sc.nextInt();
				if(a==0)
					 break aa;
			
			}while(a==1);
				
			}
			
			else if(k==2)
			{
				
				
				mm:
				do {
				System.out.println("\n\t\tMENU   FOR   MAGAZINE...\n\n\t1.READ  \t\t2.DISPLAY \n\t3.SALE MAGAZINE COPIES \t4.RECEIVE NEW ISSUE\n");
				int d;
				System.out.print("\n\tChoice::");
				d=sc.nextInt();
				switch(d) {
				case 1:
					System.out.println("==============================================================================\n");
					m.read_mag();
					System.out.println("==============================================================================\n");
					break;
				case 2:
					System.out.println("==============================================================================\n");
					m.display_mag();
					System.out.println("==============================================================================\n");
					break;
				case 3:
					System.out.println("==============================================================================\n");
					System.out.println("HOW MANY COPIES YOU WANT(customer)??  ");
					int n3=sc.nextInt();
					m.sale_copy(n3);
					System.out.println("==============================================================================\n");
					break;
				case 4:
					System.out.println("==============================================================================\n");
					System.out.println("ENTER THE NEW ISSUE DATE [dd/mm/yyyy]: ");
					String date=sc.next();
					m.receive_issue(date);
					System.out.println("==============================================================================\n");
					break;
				}
				System.out.println("DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]\n\t1.YES\t0.NO");
				System.out.print("\tChoice::");
				a=sc.nextInt();
				if(a==0)
					break mm;
				
			}while(a==1);
			}
			
			else if (k==3) {
				System.out.println("\n\tTOTAL SALE AMOUNT IS(to be paid by customer)  = "+(b.getTotal()+m.getTotal())+ "  ");
			}
			
			else if(k==4) {
				System.out.println("\n\tTOTAL REVENUE OF PUBLICATION IS  :  "+ (b.getCopies()*b.getprice() + m.getCopies()*m.getprice()));
			}
			
			else
				System.out.println("invalid key....");
			System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION???\n\t1.CONTINUE \t0.TERMINATE");
			outer=sc.nextInt();
	}while(outer!=0);
	sc.close();
	}
}


/*
 
OUTPUT


	CHOOSE ONE OF THE FOLLOWING....

	1.BOOK 			2.MAGAZINE

	3.TOTAL SALE AMOUNT	4.REVENUE OF PUBLICATION


Choice::1

		MENU   FOR   BOOK
	1.read book 		2.display 
	3.sale copies 		4.order copies
	Choice::1
==============================================================================

enter title : Geeta
enter price:  450
enter copies: 5
enter author book: Vaibhav
==============================================================================

Do you want to continue with book section[1/0]
	1.YES 		0.NO
	Choice::1

		MENU   FOR   BOOK
	1.read book 		2.display 
	3.sale copies 		4.order copies
	Choice::2
==============================================================================

title 	price 	copy 	author
Geeta	450	5	Vaibhav
==============================================================================

Do you want to continue with book section[1/0]
	1.YES 		0.NO
	Choice::1

		MENU   FOR   BOOK
	1.read book 		2.display 
	3.sale copies 		4.order copies
	Choice::3
==============================================================================

HOW MANY COPIES YOU(for customer) WANT : 10
     INSUFFICIENT STOCK!!!!!!!!!
==============================================================================

Do you want to continue with book section[1/0]
	1.YES 		0.NO
	Choice::1

		MENU   FOR   BOOK
	1.read book 		2.display 
	3.sale copies 		4.order copies
	Choice::3
==============================================================================

HOW MANY COPIES YOU(for customer) WANT : 4
	YOU PURCHASED  4  COPIES 
	YOU HAVE TO PAY :  1800
==============================================================================

Do you want to continue with book section[1/0]
	1.YES 		0.NO
	Choice::1

		MENU   FOR   BOOK
	1.read book 		2.display 
	3.sale copies 		4.order copies
	Choice::4
==============================================================================

ENTER COPIES WANT TO ORDER(for shop): 11

	ORDER SUCESSFUL....
	COPIES AVAILABLE : 12
==============================================================================

Do you want to continue with book section[1/0]
	1.YES 		0.NO
	Choice::0
DO YOU WANT TO CONTINUE WITH PUBLICATION???
	1.CONTINUE 	0.TERMINATE
1


	CHOOSE ONE OF THE FOLLOWING....

	1.BOOK 			2.MAGAZINE

	3.TOTAL SALE AMOUNT	4.REVENUE OF PUBLICATION


Choice::2

		MENU   FOR   MAGAZINE...

	1.READ  		2.DISPLAY 
	3.SALE MAGAZINE COPIES 	4.RECEIVE NEW ISSUE


	Choice::1
==============================================================================

enter title : TimeOfIndia
enter price:  15
enter copies: 20
Enter THe Current Issue Date [dd/mm/yyyy]01052020
==============================================================================

DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]
	1.YES	0.NO
	Choice::1

		MENU   FOR   MAGAZINE...

	1.READ  		2.DISPLAY 
	3.SALE MAGAZINE COPIES 	4.RECEIVE NEW ISSUE


	Choice::
2
==============================================================================

title 	price 	copy 	date
TimeOfIndia	15	20	01052020
==============================================================================

DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]
	1.YES	0.NO
	Choice::1

		MENU   FOR   MAGAZINE...

	1.READ  		2.DISPLAY 
	3.SALE MAGAZINE COPIES 	4.RECEIVE NEW ISSUE


	Choice::3
==============================================================================

HOW MANY COPIES YOU WANT(customer)??  
15
	YOU PURCHASED  15  COPIES 
	YOU HAVE TO PAY :  225
==============================================================================

DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]
	1.YES	0.NO
	Choice::1

		MENU   FOR   MAGAZINE...

	1.READ  		2.DISPLAY 
	3.SALE MAGAZINE COPIES 	4.RECEIVE NEW ISSUE


	Choice::4
==============================================================================

ENTER THE NEW ISSUE DATE [dd/mm/yyyy]: 
02072020
ENTER NEW COPIES ORDERED: 
5
	THE MAGAZINE TimeOfIndia 
	 WITH ISSUE DATE 02072020AVAILABLE
==============================================================================

DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]
	1.YES	0.NO
	Choice::1

		MENU   FOR   MAGAZINE...

	1.READ  		2.DISPLAY 
	3.SALE MAGAZINE COPIES 	4.RECEIVE NEW ISSUE


	Choice::2
==============================================================================

title 	price 	copy 	date
TimeOfIndia	15	5	02072020
==============================================================================

DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]
	1.YES	0.NO
	Choice::0
DO YOU WANT TO CONTINUE WITH PUBLICATION???
	1.CONTINUE 	0.TERMINATE
1


	CHOOSE ONE OF THE FOLLOWING....

	1.BOOK 			2.MAGAZINE

	3.TOTAL SALE AMOUNT	4.REVENUE OF PUBLICATION


Choice::3

	TOTAL SALE AMOUNT IS(to be paid by customer)  = 2025  
DO YOU WANT TO CONTINUE WITH PUBLICATION???
	1.CONTINUE 	0.TERMINATE
1


	CHOOSE ONE OF THE FOLLOWING....

	1.BOOK 			2.MAGAZINE

	3.TOTAL SALE AMOUNT	4.REVENUE OF PUBLICATION


Choice::4

	TOTAL REVENUE OF PUBLICATION IS  :  5475
DO YOU WANT TO CONTINUE WITH PUBLICATION???
	1.CONTINUE 	0.TERMINATE
0


	
*/
