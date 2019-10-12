package cms;

import java.util.ArrayList;

public class StudentSchedule extends Schedule {
	
	public String studentScheduleYear;
	public String createdDate;
	
	public StudentSchedule(ArrayList<Course> courseList)
	{
		super( courseList);
	}
	
	public StudentSchedule()
	{
		super();
	}
}
