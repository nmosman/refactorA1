package cms;

public class Student{
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String name;
	private String studentId;
	private String username; 
	private String address;
	private String userType;
	
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
		//to be added in version 1.0
		return 0;
		
	}
	
	public void printCourses()
	{
		//to be added in version 1.0
	}
	
	public void dropCourse()
	{
		//to be added in version 1.0
		
	}
	
	public void payForCourse()
	{
		//to be added in version 1.0
	}
}
