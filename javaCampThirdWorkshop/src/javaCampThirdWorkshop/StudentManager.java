package javaCampThirdWorkshop;

public class StudentManager extends UserManager {

	@Override
	public void addUser(User user) {
		System.out.println("Student " + user.userName + " added as a student.");
		
	}
		
}
