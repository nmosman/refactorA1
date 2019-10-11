package cms;
import java.util.Scanner;

public class Driver {
	
	static DbAPI db = new DbAPI();
	
	public static boolean login(String username, String password)
	{
		return db.login(username, password);
		
	}
	
	public void getChoice()
	{
		
		
	}
	
	public void printSchedule(String username)
	{
		StudentSchedule s = db.getStudentSchedule(username);
		s.printSchedule();
	}
	
	public void addCourse()
	{
		
	}
	public static void main(String [] args)
	{
		
		
		System.out.println("Welcome to the driver debug program for our Course Management System v0.0.1!");
		System.out.println("Please log in with either a test student/teacher/admin account!");
		
		Scanner input = new Scanner(System.in);
		
		String username = input.nextLine();
		
		System.out.print("Now enter in your password!");
		String password = input.nextLine();
		username  = username.trim();
		password = password.trim();
		if (login(username, password) )
		{
			System.out.println("Thanks for logging in!");
			
			Permissions p = db.getPermissionType(username);
			String permission = p.getPermissionType();
			System.out.println("logged on as a " + p.getPermissionType() + " type account");
			
		
			
			switch(permission)
			{
			case "student":
				
				System.out.println("Student Course Menu:\n (1) View Schedule\n (2) Add course\n (3) Drop Course\n(4) Pay Fees");
				int choice = input.nextInt();
				if(choice == 1)
				{
					System.out.println("Nice!");
				}
				while(choice!= 1 && choice !=2 && choice !=3 && choice !=4)
				{
			
					System.out.println("Not valid choice, here's the menu again:\nStudent Course Menu:\n (1) View Schedule\n (2) Add course\n (3) Drop Course\n(4) Pay Fees");
					choice = input.nextInt();
				}
				
				if(choice == 1)
				{
					StudentSchedule s = db.getStudentSchedule(username);
					s.printSchedule();
				}
				
				else if(choice == 2)
				{
					System.out.println("Add Course");
				}
				
				else if(choice == 3)
				{
					System.out.println("Drop Course");
				}
				
				else if(choice == 4)
				{
					System.out.println("Pay Fees");
				}
				break;
			case "teacher":
				System.out.println("Teacher Course Menu:\n (1) View Schedule\n (2) Create course\n");
				choice = input.nextInt();
				
				while(choice!= 1 && choice !=2 && choice !=3 && choice !=4)
				{
					System.out.println("Not valid choice, here's the menu again:\nTeacher Course Menu:\n (1) View Schedule\n (2) Create course\n");
					choice = input.nextInt();
				}
				
				if(choice == 1)
				{
					System.out.println("View Schedule");
				}
				
				else if(choice == 2)
				{
					System.out.println("Create a course:");
					Teacher t = db.getTeacher(username);
					
					System.out.println("Enter in the course name: ");
					String courseName = input.nextLine();
					
					System.out.println("Enter in the course id: ");
					String courseId = input.nextLine();
					
					t.createCourse(courseId, courseName);
					
					System.out.println("You've created course:  " + courseName + " " + courseId + " !");
					
				}
				
				else if(choice == 3)
				{
					System.out.println("Create a course");
				}
				break;
			case "admin":
				System.out.println("Admin Course Menu:\n (1) Create Course\n (2) Delete course\n");
				choice = input.nextInt();
				
				while(choice!= 1 && choice !=2 && choice !=3 && choice !=4)
				{
					System.out.println("Not valid choice, here's the menu again:\nAdmin Course Menu:\n (1) Create Course\n (2) Delete course\n");
					choice = input.nextInt();
				}
				
				if(choice == 1)
				{
					
				}
				else if(choice == 2)
				{
					System.out.println("Delete course!");
				}
				
				break;
			default:
				break;
			}
			
			
		}
		else
		{
			System.out.println("invalid credentials, shutting down...");
			System.exit(0);
		}
		
	}
}
