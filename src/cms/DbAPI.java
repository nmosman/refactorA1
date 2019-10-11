package cms;

import java.util.ArrayList;

public class DbAPI {

	private ArrayList<Student> StudentCache;
	private ArrayList<Teacher> TeacherCache;
	private ArrayList<Course> CourseCache;
	
	public DbAPI()
	{	
		
		CourseCache = new ArrayList<Course>();
		createDummyCourses();
		populateCache();
		
	}
	
	public void createDummyCourses()
	{
		Course c1  = new Course("Intro to Computing ", "CPSC 101");
		Course c2  = new Course("Math for Engineers I", "MATH 102");
		Course c3  = new Course("Advanced Physics", "PHYS 491");
		Course c4  = new Course("English Writing", "ENGL 201");
		Course c5  = new Course("Statistics", "STATS 211");
		
		CourseCache.add(c1);
		CourseCache.add(c2);
		CourseCache.add(c3);
		CourseCache.add(c4);
		CourseCache.add(c5);
	}
	
	public void populateCache()
	{
		StudentCache = new ArrayList<Student>();
		TeacherCache = new ArrayList<Teacher>();
		for(int i = 0; i < 5; i++)
		{
			Student s = new Student("Student-" + i, "10000" + i);
			//System.out.println(s);
			
			StudentCache.add(s);
			
			Teacher t = new Teacher("Teacher-" + i, "10000" + i);
			TeacherCache.add(t);
			//System.out.println(t);
			
		}
		
		Student testStudent = new Student("student", "test", "test");
		
		
		StudentSchedule s = new StudentSchedule(CourseCache);
		testStudent.setSchedule(s);
		Teacher testTeacher = new Teacher("teacher", "test", "test");
		
		StudentCache.add(testStudent);
		TeacherCache.add(testTeacher);
	}
	public boolean login(String username, String password)
	{
		
		if(username.equals("admin") && password.equals("admin123")) {
			return true;
		}
		
		else if(username.equals("teacher") && password.equals("teacher123"))
		{
			return true;
		}
		else if (username.equals("student") && password.equals("student123"))
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
	
	public Permissions getPermissionType(String username)
	{

		if(username.equals("admin"))	
		{
			return new Permissions("admin");
		}
			
		else if(username.equals("teacher"))
		{
			return new Permissions("teacher");
		}
		else
		{
			return new Permissions("student");
		}
	}
	
	
	public StudentSchedule getStudentSchedule(String username)
	{
		for (Student s : StudentCache)
		{
			System.out.println(s.getUsername());
			
			if(s.getUsername().equals(username))
			{
				return s.getSchedule();
			}
		}
	return null;
		
	}
	
	
	public TeacherSchedule getTeacherSchedule(String username)
	{
		for (Teacher t : TeacherCache)
		{
			
			
			if(t.getUsername().equals(username))
			{
				return t.getSchedule();
			}
		}
	return null;
		
	}
	
	public void addCourse(Course c)
	{
		CourseCache.add(c);
	}
	
	public Course findCourse(String courseId)
	{
		for(Course c : CourseCache)
		{
			if(c.getId() == courseId)
			{
				return c;
			}
			
		}
		return null;
	}
	public Teacher getTeacher(String username)
	{
		for (Teacher s : TeacherCache)
		{
			System.out.println(s.getUsername());
			
			if(s.getUsername().equals(username))
			{
				return s;
			}
		}
	return null;
		
	}
}
