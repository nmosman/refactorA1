package cms;

import java.util.*;

public class Course {

		private String name;
		private String course_id;
		private ArrayList<String> instructors;
		
		private Date courseCreated; 
		private Date startDate;
		private Date endDate; 
		
		private int class_size_max;
		private int num_of_instructors;
		
		private float courseCost; 
		private String courseDescription;
		
		private ArrayList<Student> studentList = new ArrayList<Student>();
				
		
		public Course(String name, String course_id)
		{
			name = name;
			course_id = course_id;
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

		public Date getCourseCreated() {
			return courseCreated;
		}

		public void setCourseCreated(Date courseCreated) {
			this.courseCreated = courseCreated;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public int getClass_size_max() {
			return class_size_max;
		}

		public void setClass_size_max(int class_size_max) {
			this.class_size_max = class_size_max;
		}

		public int getNum_of_instructors() {
			return num_of_instructors;
		}

		public void setNum_of_instructors(int num_of_instructors) {
			this.num_of_instructors = num_of_instructors;
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
