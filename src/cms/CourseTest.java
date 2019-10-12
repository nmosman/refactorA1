package cms;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTest {


	@Test
	public void testCourseInfo() {
		String courseInfo = "testName" + " "+  "test123";
		
		// Ensure the course info is concatenated correctly
		
		Course c = new Course("testName", "test123");
		
		assertEquals(c.courseInfo(), courseInfo);
		
	}



	@Test
	public void testCreateCourse() {
		String courseName = "testName";
		String courseId = "test123";
		
		
		// Ensure constructor sets values correctly
		Course c = new Course(courseName, courseId);
		
		assertEquals(courseName, c.getName());
		assertEquals(courseId, c.getId());
	}


	@Test
	public void getCourseCost() {
		
		float delta = (float) 0.001;
		// ensure the cost is stored correctly
		Course c = new Course("test", "test");
		float cost = 400;
		c.setCourseCost(cost);
		
		assertEquals(c.getCourseCost(), 400, delta);
	}
}
