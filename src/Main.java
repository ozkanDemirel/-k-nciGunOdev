
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1,"Engin","Demirog");
		Course course1 = new Course(1, "Java + React");
		Course course2 = new Course(2, "C# + Angular");
		Course course3 = new Course(3, "Programlaya Giriþ Ýçin temek Kurs");
		
		Instructor[] instructors = {instructor1};	
		Course[] courses = {course1,course2,course3};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getId()+": "+instructor.getFirstName()+" "+instructor.getLastName());
		}
		System.out.println("******************************************************");
		
		for (Course course : courses) {
			
			System.out.println(course.getId()+": "+course.getCourseName());
			
		}
		System.out.println("******************************************************");
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		
	

	}

}
