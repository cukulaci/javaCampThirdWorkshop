package javaCampThirdWorkshop;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.userId = "12345";
		student.userName = "emre_saglam";
		
		Instructor instructor = new Instructor();
		instructor.userId = "6789";
		instructor.userName = "engin_demirog";
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.addUser(student);
		instructorManager.addUser(instructor);
		

	}

}
