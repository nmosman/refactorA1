package cms;

import static org.junit.Assert.*;

import org.junit.Test;

public class DbAPITest {



	@Test
	public void testFindCourse() {
		DbAPI db = new DbAPI();
		
		String courseId = "CPSC 101";
		Course c = db.findCourse(courseId);
		assertNotEquals(c, null);
		
		courseId = "Non Existing Course";
		
		c = db.findCourse(courseId);
		assertEquals(c, null);
	}
	
	@Test
	public void testGetStudentSchedule()
	{
		DbAPI db = new DbAPI();
		
		String username = "student";
		
		StudentSchedule s = db.getStudentSchedule(username);
		
		assertNotEquals(s, null);
	}
	
	
	@Test
	public void testGetTeacherSchedule()
	{
		DbAPI db = new DbAPI();
		
		String username = "teacher";
		
		TeacherSchedule t = db.getTeacherSchedule(username);
		
		assertNotEquals(t, null);
	}

}
