package cms;

import static org.junit.Assert.*;

import org.junit.Test;

public class DbAPITest {

	@Test
	public void testLogin()
	{
		DbAPI db = new DbAPI();
		
		// testing for student, teacher and admin. All should return true
		boolean res = db.login("student", "student123");
		
		assertEquals(res, true);
		
		res = db.login("teacher", "teacher123");
		
		assertEquals(res, true);
		
		res = db.login("admin", "admin123");
		
		assertEquals(res, true);
		
		// should not return true
		
		res = db.login("somename", "somepass");
		
		assertNotEquals(res, true);
	}

	@Test
	public void testPermissionType()
	{
		DbAPI db = new DbAPI();
		
		//testing for proper setting of permission types
		Permissions adminRights = new Permissions("admin");
		Permissions teacherRights = new Permissions("teacher");
		Permissions studentRights = new Permissions("student");
		
		String student = "student";
		String teacher = "teacher";
		String admin = "admin";
		
		// should all be true
		assertEquals(studentRights.getPermissionType(), db.getPermissionType(student).getPermissionType());
		assertEquals(adminRights.getPermissionType(), db.getPermissionType(admin).getPermissionType());
		assertEquals(teacherRights.getPermissionType(), db.getPermissionType(teacher).getPermissionType());
	
		// should not be equal
		
		assertNotEquals(teacherRights.getPermissionType(), db.getPermissionType(student).getPermissionType());
	}
	@Test
	public void testFindCourse() {
		DbAPI db = new DbAPI();
		
		// course we know that exists
		String courseId = "CPSC 101";
		Course c = db.findCourse(courseId);
		assertNotEquals(c, null);
		
		// now test for case of non-existing course
		courseId = "Non Existing Course";
		
		c = db.findCourse(courseId);
		assertEquals(c, null);
	}
	
	@Test
	public void testGetStudentSchedule()
	{
		// Setup api connection
		DbAPI db = new DbAPI();
		
		String username = "student";
		
		StudentSchedule s = db.getStudentSchedule(username);
		//checking student schedule
		assertNotEquals(s, null);
	}
	
	
	@Test
	public void testGetTeacherSchedule()
	{
		
		// Setup api connection
		DbAPI db = new DbAPI();
		
		String username = "teacher";
		
		TeacherSchedule t = db.getTeacherSchedule(username);
		
		//checking teacher schedule
		assertNotEquals(t, null);
	}

}
