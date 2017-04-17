/*In a company, there are employees with two designations Manager and Trainee.
 *  Both the employees share same set of attributes. 
 *  The basic salary calculation logic is same, but the basic salaries of trainee and manager are different.
 *   The Managers has a travel allowance equal to 15% of the basic salary,
 *    where as for Trainees, the travel allowance is 10% of the basic salary. 
 *   Write a program to maintain the entities using inheritance.
 */
public class Session4Assignment4 
{
	public static void main(String s[])
	{
		Manager M=new Manager();
		M.salaryDetails();
		Trainee T=new Trainee();
		T.salaryDetails();
	}
}
class Employee
{
	double basic_sal;
	double TA;
     Employee()
     {
    	 basic_sal=10000;
     }
     void salaryDetails()
     {
    	 System.out.println(" Basic salary is "+basic_sal);
     }
}
class Manager extends Employee
{
	Manager()
	{
		
	}
	 void salaryDetails()
	 {
		 TA=(15*basic_sal)/100;
		 double managerSal=basic_sal+TA;
		 System.out.println(" TA of Manager is "+TA);
		 System.out.println(" Total salary of Manager is "+managerSal);
	 }
}
class Trainee extends Employee
{
	Trainee()
	{
		
     }
 void salaryDetails()
 {
	 super.TA=(10*basic_sal)/100;
	 double traineeSal=super.basic_sal+super.TA;
	 System.out.println(" TA of Trainee is "+TA);
	 System.out.println(" Total salary of trainee is "+traineeSal);
 }
}