import java.util.Scanner;
public abstract class Transport {
	private final int speed;
	private final int cost;

	Transport(int speed, int cost) {
		this.speed = speed;
		this.cost = cost;
	}
	public double Time(int distance) {
		return (double) distance / this.speed;
	}

	public double Cost(int distance, int capacity, int baggage) {
		return this.Time(distance) * cost * (capacity + ((float) baggage / 80));
	}

	public static String format(double timeInHours) {
		if (timeInHours < 1) return (int) (timeInHours * 60 + 1) + " min";
		else return ((int) timeInHours) + " h " + (int) ((timeInHours - (int) (timeInHours)) * 60) + " min";
	}


	public static void main(String[] args) {
		int distance, capacity, baggageWeight;
		Scanner scan = new Scanner(System.in);

		System.out.print("Distance (km) >> ");
		distance = scan.nextInt();
		scan.nextLine();
		System.out.println();

		System.out.print("Passengers >> ");
		capacity = scan.nextInt();
		scan.nextLine();
		System.out.println();

		System.out.print("Baggage (kg) >> ");
		baggageWeight = scan.nextInt();
		scan.nextLine();
		System.out.println();

		Aircraft plane = new Aircraft();
		Train train = new Train();
		Ship ship = new Ship();
		Car car = new Car();

		System.out.println("By car: Time - " + format(car.Time(distance)) + "; Cost - " + (int) (car.Cost(distance, capacity, baggageWeight)+1) + " RUB;");
		System.out.println("By plane: Time - " + format(plane.Time(distance)) + "; Cost - " + (int) (plane.Cost(distance, capacity, baggageWeight)+1) + " RUB;");
		System.out.println("By train: Time - " + format(train.Time(distance)) + "; Cost - " + (int) (train.Cost(distance, capacity, baggageWeight)+1) + " RUB;");
		System.out.println("By ship: Time - " + format(ship.Time(distance)) + "; Cost - " + (int) (ship.Cost(distance, capacity, baggageWeight)+1) + " RUB;");
	}
}