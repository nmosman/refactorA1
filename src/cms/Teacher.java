package cms;

public class Teacher{
	private String name;
	private String teacherId;
	private String username;
	private String address;
	private String userType;
	
	private TeacherSchedule schedule = new TeacherSchedule();
	
	public Teacher(String name, String teacherId)
	{
		this.name = name;
		this.teacherId = teacherId;
		username = name + teacherId;
		
	}	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setSchedule(TeacherSchedule schedule) {
		this.schedule = schedule;
	}


	public Teacher(String username, String name, String teacherId)
	{
		this.name = name;
		this.teacherId = teacherId;
		this.username = username;
	}
	
	public TeacherSchedule getSchedule()
	{
		return schedule;
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
