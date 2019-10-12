package cms;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ScheduleTest {



	@Test
	public void testScheduleArrayListOfCourse() {
		ArrayList<Course> list = new ArrayList<Course>();
		Course c = new Course("Test", "TestID");
		list.add(c);
		
		Schedule s = new Schedule(list);
		assertEquals(s.getSchedule(), list);
		
	}

	@Test
	public void testGetSchedule() {
		Schedule s = new Schedule();
		Course c = new Course("Test", "TestID");
		s.addCourse(c);
		
		ArrayList<Course> list = new ArrayList<Course>();
		list.add(c);
		assertEquals(s.getSchedule(), list);
		
	}


	@Test
	public void testAddCourse() {
		StudentSchedule s = new StudentSchedule();
		Course c = new Course("Test", "TestID");
		s.addCourse(c);
		
		assertEquals(c, s.getSchedule().get(0));
	}

}
