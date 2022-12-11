import java.util.ArrayList;
public abstract class Learner {
	public abstract String person();
	public abstract String getName();
	static ArrayList<Learner> learnersList = new ArrayList<Learner>();

	public static void main(String [] args) {
		learnersList.add(new Pupil("Ivan"));
		learnersList.add(new Student("Oleg"));
		learnersList.add(new Student("Pavel"));
		learnersList.add(new Pupil("Vasiliy"));
		learnersList.add(new Student("Egor"));
		learnersList.add(new Student("Anastasiya"));
		learnersList.add(new Pupil("Ekaterina"));
		learnersList.add(new Student("Alexander"));

		for (int i = 0; i < learnersList.size(); i++) {
			System.out.print(learnersList.get(i).getName() + " - ");
			System.out.println(learnersList.get(i).person());
		}

		System.out.println("\nStudents:");
		for (int i = 0; i < learnersList.size(); i++) {
			if (learnersList.get(i).person().equals("Student")) {
				System.out.println(learnersList.get(i).getName());
			}
		}

		System.out.println("\nPupils:");
		for (int i = 0; i < learnersList.size(); i++) {
			if (learnersList.get(i).person().equals("Pupil")) {
				System.out.println(learnersList.get(i).getName());
			}
		}
	}
}