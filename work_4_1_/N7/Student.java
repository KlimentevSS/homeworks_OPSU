public class Student extends Learner {
	private String name;
	Student(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String person() {
		return "Student";
	}
}