package cms;

public class Teacher extends User {
	private String name;
	private String teacherId;
	private String username;
	
	private TeacherSchedule schedule = new TeacherSchedule();
	
	public Teacher(String name, String teacherId)
	{
		this.name = name;
		this.teacherId = teacherId;
		username = name + teacherId;
		
	}	
	
	
	public Teacher(String username, String name, String teacherId)
	{
		this.name = name;
		this.teacherId = teacherId;
		this.username = username;
	}
	
	
	public String getUsername()
	{
		return username;
	}
	public void createCourse(String courseId, String name) {
		Course c = new Course(name, courseId);
		c.setInstructor(name);
		schedule.addCourse(c);
	}
}
