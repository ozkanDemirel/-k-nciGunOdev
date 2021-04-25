
public class CourseManager {
	
	public void addCourse( Course course) {
		System.out.println( course.getCourseName() + " eklendi");
	}
	public void deleteCourse(Course course) {
		
		System.out.println(course.getCourseName() +" silindi");
		
	}
}
