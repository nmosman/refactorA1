package cms;

import java.util.*;

public class Course {

		private String name;
		private String course_id;
		private ArrayList<String> instructors;
		
		private String instructor;
		
	
		
		private float courseCost; 
		private String courseDescription;
		
		private ArrayList<Student> studentList = new ArrayList<Student>();
				
		public Course(String name, String courseId)
		{
			this.name = name;
			this.course_id = courseId;
		}
		
		public String courseInfo()
		{
			return name + " " + course_id;
		}
				
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return course_id;
		}

		public void setId(String course_id) {
			this.course_id = course_id;
		}

		public ArrayList<String> getInstructors() {
			return instructors;
		}

		public void setInstructors(ArrayList<String> instructors) {
			this.instructors = instructors;
		}
		
		public String getInstructor()
		{
			return instructor;
		}
		
		public void setInstructor(String instructor)
		{
			this.instructor = instructor;
		}


		public float getCourseCost() {
			return courseCost;
		}

		public void setCourseCost(float courseCost) {
			this.courseCost = courseCost;
		}

		public String getCourseDescription() {
			return courseDescription;
		}

		public void setCourseDescription(String courseDescription) {
			this.courseDescription = courseDescription;
		}

		
		public ArrayList<Student> getStudentList() {
			return studentList;
		}

		public void setStudentList(ArrayList<Student> studentList) {
			this.studentList = studentList;
		}

				
		
}
