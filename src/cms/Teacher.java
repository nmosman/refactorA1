package cms;

public class Teacher extends User {
	private String name;
	private String teacherId;
	private String username;
	
	private StudentSchedule schedule;
	
	public Teacher(String name, String teacherId)
	{
		name = name;
		teacherId = teacherId;
		username = name + teacherId;
	}	
	
	
	public Teacher(String username, String name, String teacherId)
	{
		name = name;
		teacherId = teacherId;
		username = username;
	}
	
	public void createCourse() {
		
	}
}
