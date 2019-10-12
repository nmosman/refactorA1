package cms;

import java.util.ArrayList;
import java.util.Date;

public class CourseSession {

	private Date startDate;
	private Date endDate; 
	
	private int class_size_max;
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private Date courseCreated; 

	private int num_of_instructors;
	
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

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
}
