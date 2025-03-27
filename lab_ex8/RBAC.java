package lab_ex8;
import java.util.*;
abstract class User
{
	String username;
	String password;
	static ArrayList<Admin> admins=new ArrayList<>();
	static ArrayList<Manager> managers=new ArrayList<>();
	static ArrayList<Employee> employees=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	abstract void accessSystem();
	public void changePassword(String oldpass,String newpass)
	{
		if(oldpass.equals(this.password))
		{
			this.password=newpass;
			System.out.println("Password Changed!");
			return;
		}
		System.out.println("Password Not Changed!");
	}
	public void viewAllEmployees()
	{
		for(Employee emp:this.employees)
		{
			emp.viewDetails();
			System.out.println();
		}
	}

}
class Admin extends User
{
	Admin(String username,String password)
	{
		super(username,password);
		this.admins.add(this);
	}

	public void accessSystem()
	{
		int ch;
		System.out.println("\nAdmin Access\n1.ViewAllEmployee Details\n2.Change Password\n3.Exit\n");
		do {
			System.out.println("Your Choice?");
			ch=this.sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
			case 1:
				System.out.println("\nEmployees Details");
				viewAllEmployees();
				break;
			case 2:
				System.out.println("Enter the Old Password");
				String opass=sc.nextLine();
				System.out.println("Enter the New Password");
				String npass=sc.nextLine();
				this.changePassword(opass, npass);
				break;
			case 3:
				System.out.println("Exited...");
				break;
			default:
				System.out.println("Invalid Choice");
				
			}
		}while(ch!=3);
	}
}
class Manager extends User
{
	Manager(String username,String password)
	{
		super(username,password);
		this.managers.add(this);
	}
	public void accessSystem()
	{
		int ch;
		System.out.println("\nManager Access\n1.ViewAllEmployee Details\n2.Change Password\n3.Exit\n");
		do {
			System.out.println("Your Choice?");
			ch=this.sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
			case 1:
				System.out.println("\nEmployees Details");
				this.viewAllEmployees();
				break;
			case 2:
				System.out.println("Enter the Old Password");
				String opass=sc.nextLine();
				System.out.println("Enter the New Password");
				String npass=sc.nextLine();
				this.changePassword(opass, npass);
				break;
			case 3:
				System.out.println("Exited...");
				break;
			default:
				System.out.println("Invalid Choice");
				
			}
		}while(ch!=3);
	}
}
class Employee extends User
{
	int salary,exp;
	String department;
	Employee(String username,String password)
	{
		super(username,password);
		this.employees.add(this);
	}
	public void setOrUpdate(String username,String password,String department,int exp,int salary)
	{
		this.username=username;
		this.password=password;
		this.department=department;
		this.exp=exp;
		this.salary=salary;
		System.out.println(this.username+" Details Updated or Added");
	}
	public void viewDetails()
	{
		System.out.printf("Username:%s\nPassword:%s\nDepartment:%s\nExperience:%d\nSalary:%d\n",this.username,this.password,this.department,this.exp,this.salary);
	}
	public void accessSystem()
	{
		int ch;
		System.out.println("\nEmployee Access\n1.View My Details\n2.Change Password\n3.Set Details\n4.Exit\n");
		do {
			System.out.println("Your Choice?");
			ch=this.sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
			case 1:
				System.out.println("\nMy Details");
				this.viewDetails();
				break;
			case 2:
				System.out.println("Enter the Old Password");
				String opass=sc.nextLine();
				System.out.println("Enter the New Password");
				String npass=sc.nextLine();
				this.changePassword(opass, npass);
				break;
			case 3:
				System.out.println("Enter Department");
				this.department=sc.nextLine();
				System.out.println("Enter the Experience");
				this.exp=sc.nextInt();
				System.out.println("Enter the Salary");
				this.salary=sc.nextInt();
				this.setOrUpdate(this.username, this.password,department,exp,salary);
				break;
			case 4:
				System.out.println("Exited...");
				break;
			default:
				System.out.println("Invalid Choice");
				
			}
		}while(ch!=4);
	}
}
public class RBAC {

	public static void main(String[] args) {
		User user;
		Scanner sc=new Scanner(System.in);
		Admin auser=new Admin("admin","admin123");
		Manager muser=new Manager("manager","manager123");
		Employee emp=new Employee("employee","employee123");
		Employee emp1=new Employee("employee2","employee123");
		Employee emp2=new Employee("employee3","employee123");
//		System.out.println(muser.employees);
		System.out.println("Who are you?");
		String role=sc.nextLine();
		if(role.equalsIgnoreCase("admin"))
			user=auser;
		else if(role.equalsIgnoreCase("manager"))
			user=muser;
		else
			user=emp;
		System.out.println("Username:");
		String username=sc.nextLine();
		System.out.println("Password:");
		String password=sc.nextLine();
		if(username.equals(user.username) && password.equals(user.password))
			user.accessSystem();
		else
			System.out.println("Invalid Credentials");

	}

}
