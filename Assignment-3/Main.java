
//Problem Statement::
/*
Design and develop inheritance for a given case study, identify objects and relationships 
and implement inheritance wherever applicable. Employee class has Emp_name, Emp_id, 
Address, Mail_id, and Mobile_no as members. Inherit the classes: Programmer, Team Lead, 
Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as 
the member of all the inherited classes . with 97% of BP as DA, 10 % of BP as HRA, 12% of 
BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their 
gross and net salary 
*/   

package assignment;
import java.util.*;
class Employee {
	Scanner sc= new Scanner(System.in);//Scanner class Object
	String emp_name;//declaration of Employee name 
	String address;//declaration of address
	String mail_id;//declaration of mail id
	long mobile_no;//declaration of mobile no.
	int emp_id;//declaration of Employee ID
	double basic_pay;//declaration of basic pay
	static int id=10000;
	double net_salary,gross_salary;//declaration of net & gross Salary
	double hra,da,pf,staff_club_fund;//declaration of hra,da,pf,staff_club_fund
	
	 Employee(){//Constructor for Employee
		 id++;
	}
	 
	void input() {
	System.out.print("Enter the name of Employee: ");
	emp_name=sc.nextLine();//input Employee name
	System.out.print("Employee ID:  ");
	emp_id=sc.nextInt();//input Employee Employee ID
	emp_id=id;
	System.out.print("Enter Address:  ");
	address=sc.next();//input Employee address
	System.out.print("Enter Mobile No.:  ");
	mobile_no=sc.nextLong();//input Employee mobile no.
	}
	
	void display(){
		//display database for Employee
      	System.out.println("****************************************************************");
		System.out.println("EMP NAME\tID \tADDRESS\t\tMOBILE");
		System.out.println("****************************************************************");	     
System.out.println(emp_name+"\t\t"+emp_id+"\t"+address+"\t\t"+mobile_no +"\n");	
	}
	
	void salary(){
		da=basic_pay*.97;//calculating da
		hra=basic_pay*.10;//calculating hra
		 pf=basic_pay*.12;//calculating pf
		staff_club_fund=basic_pay*0.001;//calculating staff_club_fund
		gross_salary=basic_pay + hra;//calculating gross salary
		
		int k=0;
		while(k<3) {			//loop for bonus salary
			System.out.println("   DOES DO YO HAVE DONE ANY EXTRA WORK \n\t1. PATENT \n\t2. OTHER BENIFICIAL WORK \n\t3.NO  ");
			System.out.print("Choice::");
			k=sc.nextInt();
			if (k==1) //if input is 1
				gross_salary+=3000;
			else if(k==2)//if input is 2
				gross_salary+=2000;
			else if(k==3)//if input is 3
				break;
			else//if invaid choice
				System.out.println("INVALID CHOICE.");
		}
		
		net_salary=gross_salary-pf-staff_club_fund;
		//calculating net salary
		System.out.println("=================================================================================");
	}
	
	void salary_slip() {
		//printing salary slip of Employee
		System.out.println("****************************************************************");
		System.out.println(" BASIC   PAY 		:	"+basic_pay);
		System.out.println(" HRA 	    	       	:	"+hra);
		System.out.println(" PF   	    		       :	"+pf);
		System.out.println(" GROSS SALARY       	: 	"+gross_salary);
		System.out.println(" NET SALARY 	       	: 	"+ net_salary);
		System.out.println("****************************************************************");
	}
	

}


//************************ CLASS PROGRAMMER ************************//

class Programmer extends Employee{
//inheriting Employee class in Programmer class
		void read_programmer() {
			//input data from user for Programmer
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC PAY[30000-40000]: ");
			basic_pay=sc.nextDouble();
			if(basic_pay>40000 || basic_pay<30000) {
				//validation for basic_pay of Programmer
				System.out.println("SORRY!!!!!! BASIC  PAY FOR PROGRAMMER  MUST BETWEEN  [30000 - 40000]  \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}

			System.out.println("=================================================================================");
		}
		
		static void search(Programmer arr[],int key,int n) {
			//search for programmer in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if Programmer found in database
					arr[i].display();//dispay database for programmer
					arr[i].salary_slip();//printing salary slip
				}
				else {
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  PROGRAMMERS  ");
				}		
			}
		}
	}


//************************ CLASS TEAMLEAD ************************//

class Teamlead extends Employee{
//inheriting Employee class in Teamlead class
		void read_teamlead() {
			//input data from user for Teamlead
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [40000 - 50000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>50000 || basic_pay<40000) {
				//validation for basic pay of Teamlead
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [40000 - 50000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}
			System.out.println("=================================================================================");
	}
		
		static void search(Teamlead arr[],int key,int n) {
			//searching for teamlead in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if teamlead found in database
					arr[i].display();//dispay database for Teamlead
					arr[i].salary_slip();//printing salary slip
				}
				else {
					//if teamlead is not found in database
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
				}
			}
		}
	}

//************************ CLASS aSST_PRO_MANAGER ************************//

class Asst_pro_manager extends Employee{
//inheriting Employee class in Asst_pro_manager class
		void read_Asst_pro_manager() {
			//input data from user for Asst_pro_manager
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [50000 - 60000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>60000 || basic_pay<50000) {
				//validation for basic pay of Asst_pro_manager
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [50000 - 60000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}
			System.out.println("=================================================================================");
	}
		
		static void search(Asst_pro_manager arr[],int key,int n) {
			//searching for Asst_pro_manager in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if Asst_pro_manager found in database
					arr[i].display();//dispay database for Asst_pro_manager
					arr[i].salary_slip();//printing salary slip	
				}
				else {
					//if Asst_pro_manager is not found in database
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
				}		
			}
		}
	}

//************************ CLASS PRO_MANAGER ************************//

class Pro_manager extends Employee{
	void read_Pro_manager() {
		//input data from user for Pro_manager
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [60000 - 70000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>70000 || basic_pay<60000) {
				//validation for basic pay of pro_manager
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [60000 - 70000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
			}
			System.out.println("=================================================================================");
	}
		
		static void search(Pro_manager arr,int key) {
			//searching for pro_manager in database
			if (arr.emp_id==key) {
				System.out.println("       EMPLOYEE  FOUND  ");
				//if pro_manager found in database
				arr.display();//dispay database for Pro_manager
				arr.salary_slip();//printing salary slip
			}
			else {
				//if pro_manager is not found in database
				System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
			}
		}
	}

//************************ CLASS MAIN ************************//

public class Main {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Programmer p[]=new Programmer[3];			 
			//array of obj for Programmer
			Teamlead t[]=new Teamlead[3];                
			//array of obj for Teamlead
			Asst_pro_manager a[]=new Asst_pro_manager[2];
			//array of obj for Asst_pro_manager
			Pro_manager m=new Pro_manager();			 
			//array of obj for Pro_manager
			aa:
			do {
				//menu driven program
				System.out.println("=================================================================================");
				System.out.println(" MAIN  MENU  \n\n1.PROGRAMMER \n2.TEAM LEAD \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER \n5.EMPLOYEE SEARCH \n6.EXIT");
				System.out.print("Choice::");
				int k=sc.nextInt();//input choice from user
				System.out.println("=================================================================================");
				int op;
				int assign1=0,assign2=0,assign3=0,assign4=0;		
				//variable to check memory is allocated or not for each class 
				switch(k) {
				
				case 1://if input from user is 1
					do {
						System.out.print("\tPROGRAMMER  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM PROGRAMMER \n\tChoice::");
						op=sc.nextInt();
						//input choice from user
						System.out.println("=================================================================================");
						if(op==1)//if input from user is 1
						{
							assign1=6;
							for (int i=0;i<3;i++) {
								p[i]=new Programmer();
								//creating object of Programmer
								p[i].read_programmer();
								//taking input for Programmer
								p[i].salary();
								//printing salary of Programmer
							}
						}
						else if(op==2  && assign1==6)
						{
							for (int i=0;i<3;i++) {
								p[i].display();
							//display database for programmer
								p[i].salary_slip();
							//printing salary slip of Programmer
							}
						}
						else if(op==2 && assign1!=6)
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
				
				case 2://if input from user is 2
					do {
						System.out.print("\tTEAMLEAD  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM TEAMLEAD SECTION  \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
							assign2=4;
							for (int i=0;i<3;i++) {
								t[i]=new Teamlead();
								//creating object of teamlead
								t[i].read_teamlead();
								//taking input for teamlead
								t[i].salary();
								//printing salary of teamlead
							}
						}
						else if(op==2 && assign2==4)
						{
							for (int i=0;i<3;i++) {
								t[i].display();
								//display database for teamlead
								t[i].salary_slip();
							//printing salary slip of teamlead
						}
					}
						else if(op==2 && assign1!=6) 
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  TEAMLEADS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 3://if input from user is 3
					do {
						System.out.print("\tASSISTANT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  ASSISTANT MANAGER \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
							assign3=2;
							for (int i=0;i<2;i++) {
								a[i]=new Asst_pro_manager();
							//creating object of Assistant_Manager
								a[i].read_Asst_pro_manager();
							//taking input for Assistant_Manager
								a[i].salary();
							//printing salary of Assistant_Manager
							}
						}
						else if(op==2 && assign3==2)
						{
							for (int i=0;i<2;i++) {
								a[i].display();
						//display database for Assistant_Manager
								a[i].salary_slip();
						//printing salary slip of Assistant_Manager
						}
					}
						else if(op==2 && assign1!=6) 										System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 4://if input from user is 4
					do {
						System.out.print("\tPROJECT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  PROJECT  MANAGER  SECTION \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
								assign4=1;
								m.read_Pro_manager();
							//taking input for Project_Manager
								m.salary();
							//printing salary of Project_Manager
						}
						else if(op==2 && assign4==1)
						{
								m.display();
							//display database for Project_Manager
								m.salary_slip();
						//printing salary slip of Project_Manager
						}
						else if(op==2 && assign1!=6) System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 5://if input from user is 5
					String des;
					int key;
					System.out.print("ENTER  THE  DISIGNATION  OF  EMPLOYEE  YOU  WANT  TO  SEARCH : ");
					des=sc.next();
					//taking input from user
					System.out.print("Enter Emplyee ID:");
					key=sc.nextInt();
					//taking Emplyee ID from user
					if(des.toLowerCase().equals("programmer"))
					{
						//searching for programmer in database
						Programmer.search(p,key,6);
					}
					else if(des.toLowerCase().equals("teamlead"))
					{
						//searching for teamlead in database
						Teamlead.search(t, key, 4);
					}
					else if(des.toLowerCase().equals("assistant"))
					{
						//searching for assistant in database
						Asst_pro_manager.search(a, key, 2);
					}
					else if(des.toLowerCase().equals("manager"))
					{
						//searching for manager in database
						Pro_manager.search(m, key);
					
					}
					else {
						//if invalid input
						System.out.println("INVALID INPUT");
					}
					System.out.println("===================================================================================================");
					break;
					
				case 6://if input from user is 6
					System.out.print("Would you like to Exit\n\t1.YES\n\t2.No\n\tChoice::");
					int temp=sc.nextInt();
					if(temp==1)//checking for breaking loop
						break aa;//breaking menu bar
					
				default://default 
					System.out.println("   INVALID   ");
				}
				
			}while(true);
			sc.close();//closing scanner class object
		}
}


//********************************************************************//



/*


## Output ##

=================================================================================
MAIN  MENU  

1.PROGRAMMER 
2.TEAM LEAD 
3.ASSISTANT PROJECT MANAGER 
4.PROJECT MANAGER 
5.EMPLOYEE SEARCH 
6.EXIT
Choice::1
=================================================================================
	PROGRAMMER  MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM PROGRAMMER 
	Choice::1
=================================================================================
Enter the name of Employee: Vaibhav
Employee ID:  1
Enter Address:  Jalgaon
Enter Mobile No.:  8657575665
BASIC PAY[30000-40000]: 35241
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::1
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
Enter the name of Employee: Om
Employee ID:  45
Enter Address:  pune
Enter Mobile No.:  8657421535
BASIC PAY[30000-40000]: 65241
SORRY!!!!!! BASIC  PAY FOR PROGRAMMER  MUST BETWEEN  [30000 - 40000]  
TRY AGAIN.....
BASIC PAY[30000-40000]: 36589
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
Enter the name of Employee: Yash
Employee ID:  45
Enter Address:  Yeola
Enter Mobile No.:  9856321475
BASIC PAY[30000-40000]: 35000
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
===================================================================================================
	PROGRAMMER  MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM PROGRAMMER 
	Choice::2
=================================================================================
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Vaibhav		10002	Jalgaon		8657575665

****************************************************************
BASIC   PAY 		:	35241.0
HRA 	    		:	3524.1000000000004
PF   	    		:	4228.92
GROSS SALARY  	: 	41765.1
NET SALARY 	 	: 	37500.939
****************************************************************
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Om		10003	pune		8657421535

****************************************************************
BASIC   PAY 		:	36589.0
HRA 	    		:	3658.9
PF   	    		:	4390.68
GROSS SALARY  	: 	40247.9
NET SALARY 	 	: 	35820.631
****************************************************************
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Yash		10004	Yeola		9856321475

****************************************************************
BASIC   PAY 		:	35000.0
HRA 	    		:	3500.0
PF   	    		:	4200.0
GROSS SALARY 	: 	38500.0
NET SALARY 	 	: 	34265.0
****************************************************************
===================================================================================================
	PROGRAMMER  MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM PROGRAMMER 
	Choice::3
=================================================================================
===================================================================================================
=================================================================================
MAIN  MENU  

1.PROGRAMMER 
2.TEAM LEAD 
3.ASSISTANT PROJECT MANAGER 
4.PROJECT MANAGER 
5.EMPLOYEE SEARCH 
6.EXIT
Choice::2
=================================================================================
	TEAMLEAD  MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM TEAMLEAD SECTION  
	Choice::1
===================================================================================================
Enter the name of Employee: Rahul
Employee ID:  42
Enter Address:  Parola
Enter Mobile No.:  9856741235
BASIC   PAY  [40000 - 50000] : 45236
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::1
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::2
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
Enter the name of Employee: Harsh
Employee ID:  36
Enter Address:  Satara
Enter Mobile No.:  8695741253
BASIC   PAY  [40000 - 50000] : 53241
SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [40000 - 50000] 
TRY AGAIN.....
BASIC   PAY  [40000 - 50000] : 45263
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
Enter the name of Employee: Bhushan
Employee ID:  56
Enter Address:  Pimpri
Enter Mobile No.:  9786541236
BASIC   PAY  [40000 - 50000] : 45260
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
===================================================================================================
	TEAMLEAD  MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM TEAMLEAD SECTION  
	Choice::2
===================================================================================================
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Rahul		10005	Parola		9856741235

****************************************************************
BASIC   PAY 		:	45236.0
HRA 	    		:	4523.6
PF   	    		:	5428.32
GROSS SALARY  	: 	54759.6
NET SALARY 	 	: 	49286.044
****************************************************************
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Harsh		10006	Satara		8695741253

****************************************************************
BASIC   PAY 		:	45263.0
HRA 	    		:	4526.3
PF   	    		:	5431.5599999999995
GROSS SALARY  	: 	49789.3
NET SALARY 	 	: 	44312.477000000006
****************************************************************
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Bhushan		10007	Pimpri		9786541236

****************************************************************
BASIC   PAY 		:	45260.0
HRA 	    		:	4526.0
PF   	    		:	5431.2
GROSS SALARY  	: 	49786.0
NET SALARY 	 	: 	44309.54
****************************************************************
===================================================================================================
	TEAMLEAD  MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM TEAMLEAD SECTION  
	Choice::3
===================================================================================================
===================================================================================================
=================================================================================
MAIN  MENU  

1.PROGRAMMER 
2.TEAM LEAD 
3.ASSISTANT PROJECT MANAGER 
4.PROJECT MANAGER 
5.EMPLOYEE SEARCH 
6.EXIT
Choice::3
=================================================================================
	ASSISTANT MANAGER MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM  ASSISTANT MANAGER 
	Choice::1
===================================================================================================
Enter the name of Employee: Priya
Employee ID:  47
Enter Address:  Nanded
Enter Mobile No.:  8695321479
BASIC   PAY  [50000 - 60000] : 57421
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::1
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::2
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
Enter the name of Employee: Sneha
Employee ID:  32
Enter Address:  Jalgaon
Enter Mobile No.:  9258746315
BASIC   PAY  [50000 - 60000] : 63524
SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [50000 - 60000] 
TRY AGAIN.....
BASIC   PAY  [50000 - 60000] : 56382
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
===================================================================================================
	ASSISTANT MANAGER MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM  ASSISTANT MANAGER 
	Choice::2
===================================================================================================
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Priya		10008	Nanded		8695321479

****************************************************************
BASIC   PAY 		:	57421.0
HRA 	    		:	5742.1
PF   	    		:	6890.5199999999995
GROSS SALARY  	: 	68163.1
NET SALARY 	 	: 	61215.15900000001
****************************************************************
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Sneha		10009	Jalgaon		9258746315

****************************************************************
BASIC   PAY 		:	56382.0
HRA 	    		:	5638.200000000001
PF   	    		:	6765.84
GROSS SALARY  	: 	62020.2
NET SALARY 	 	: 	55197.978
****************************************************************
===================================================================================================
	ASSISTANT MANAGER MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM  ASSISTANT MANAGER 
	Choice::3
===================================================================================================
===================================================================================================
=================================================================================
MAIN  MENU  

1.PROGRAMMER 
2.TEAM LEAD 
3.ASSISTANT PROJECT MANAGER 
4.PROJECT MANAGER 
5.EMPLOYEE SEARCH 
6.EXIT
Choice::4
=================================================================================
	PROJECT MANAGER MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM  PROJECT  MANAGER  SECTION 
	Choice::1
===================================================================================================
Enter the name of Employee: Vivek
Employee ID:  53
Enter Address:  Pune
Enter Mobile No.:  8357426935
BASIC   PAY  [60000 - 70000] : 68532
=================================================================================
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::1
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::2
 DOES DO YO HAVE DONE ANY EXTRA WORK 
	1. PATENT 
	2. OTHER BENIFICIAL WORK 
	3.NO  
Choice::3
=================================================================================
===================================================================================================
	PROJECT MANAGER MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM  PROJECT  MANAGER  SECTION 
	Choice::2
===================================================================================================
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Vivek		10009	Pune		8357426935

****************************************************************
BASIC   PAY 		:	68532.0
HRA 	    		:	6853.200000000001
PF   	    		:	8223.84
GROSS SALARY  	: 	80385.2
NET SALARY 	 	: 	72092.828
****************************************************************
===================================================================================================
	PROJECT MANAGER MENU .....
	1. INPUT 
	2. DISPLAY  
	3. EXIT FROM  PROJECT  MANAGER  SECTION 
	Choice::3
===================================================================================================
===================================================================================================
=================================================================================
MAIN  MENU  

1.PROGRAMMER 
2.TEAM LEAD 
3.ASSISTANT PROJECT MANAGER 
4.PROJECT MANAGER 
5.EMPLOYEE SEARCH 
6.EXIT
Choice::5
=================================================================================
ENTER  THE  DISIGNATION  OF  EMPLOYEE  YOU  WANT  TO  SEARCH : programmer
Enter Emplyee ID:10002
     EMPLOYEE  FOUND  
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Vaibhav		10002	Jalgaon		8657575665

****************************************************************
BASIC   PAY 		:	35241.0
HRA 	    		:	3524.1000000000004
PF   	    		:	4228.92
GROSS SALARY  	: 	41765.1
NET SALARY 	 	: 	37500.939
****************************************************************
EMPLOYEEE   WITH  ID  10002  NOT FOUND IN  PROGRAMMERS  
EMPLOYEEE   WITH  ID  10002  NOT FOUND IN  PROGRAMMERS  
===================================================================================================
=================================================================================
MAIN  MENU  

1.PROGRAMMER 
2.TEAM LEAD 
3.ASSISTANT PROJECT MANAGER 
4.PROJECT MANAGER 
5.EMPLOYEE SEARCH 
6.EXIT
Choice::5
=================================================================================
ENTER  THE  DISIGNATION  OF  EMPLOYEE  YOU  WANT  TO  SEARCH : manager
Enter Emplyee ID:10009
     EMPLOYEE  FOUND  
****************************************************************
EMP NAME	ID 	ADDRESS		MOBILE
****************************************************************
Vivek		10009	Pune		8357426935

****************************************************************
BASIC   PAY 		:	68532.0
HRA 	    		:	6853.200000000001
PF   	    		:	8223.84
GROSS SALARY  	: 	80385.2
NET SALARY 	 	: 	72092.828
****************************************************************
===================================================================================================
=================================================================================
MAIN  MENU  

1.PROGRAMMER 
2.TEAM LEAD 
3.ASSISTANT PROJECT MANAGER 
4.PROJECT MANAGER 
5.EMPLOYEE SEARCH 
6.EXIT
Choice::6
=================================================================================
Would you like to Exit
	1.YES
	2.No
	Choice::1

*/
