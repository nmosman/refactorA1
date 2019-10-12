package cms;

import java.util.ArrayList;

public class Schedule {
	protected ArrayList<Course> courseList = new ArrayList<Course>();
	
	public Schedule()
	{
		
	}
	
	
	public void printSchedule()
	{
		for (Course c : courseList)
		{
			System.out.println(c.courseInfo());
		}
	}
	
	public Schedule(ArrayList<Course> courseList)
	{
		this.courseList = courseList;
	}
	
	public ArrayList<Course> getSchedule()
	{
		return courseList;
	}
	
	public void addCourse(Course c)
	{
		courseList.add(c);
	}
}
