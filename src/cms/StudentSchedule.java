package cms;

import java.util.ArrayList;

public class StudentSchedule {
	private ArrayList<Course> courseList = new ArrayList<Course>();
	
	public StudentSchedule()
	{
		
	}
	public void printSchedule()
	{
		for (Course c : courseList)
		{
			System.out.println(c.courseInfo());
		}
	}
	
	public StudentSchedule(ArrayList<Course> courseList)
	{
		this.courseList = courseList;
	}
	
	public ArrayList<Course>  getSchedule()
	{
		return courseList;
	}
	
	public void addCourse(Course c)
	{
		courseList.add(c);
	}
}
