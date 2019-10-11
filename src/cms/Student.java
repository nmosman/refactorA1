package cms;

public class Student extends User{
	private String name;
	private String studentId;
	private String username; 
	
	private StudentSchedule schedule;
	
	public Student(String name, String studentId)
	{
		this.name = name;
		this.studentId = studentId;
		username = name + studentId;
	}
	
	public Student(String username, String name, String studentId)
	{
		this.username = username;
		this.name = name;
		this.studentId = studentId;
	}
	public void joinCourse(String joinCode)
	{
		
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getStudentID()
	{
		return studentId;
	}
	public void setSchedule(StudentSchedule s)
	{
		schedule = s;
	}
	
	public StudentSchedule getSchedule()
	{
		return schedule;
	}
	public float getTotalTuition()
	{
		return 0;
		
	}
	
	public void printCourses()
	{
		
	}
	
	public void dropCourse()
	{
		
		
	}
	
	public void payForCourse()
	{
		
	}
}
