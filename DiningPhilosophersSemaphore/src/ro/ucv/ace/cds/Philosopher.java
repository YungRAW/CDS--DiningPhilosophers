package ro.ucv.ace.cds;
import java.util.concurrent.ThreadLocalRandom;

public class Philosopher extends Thread {

	public int number;
	public Fork leftFork;
	public Fork rightFork;

	Philosopher(int num, Fork left, Fork right) {
		number = num;
		leftFork = left;
		rightFork = right;
	}

	public void run() {
		System.out.println("Philosopher #" + number);

		while (true) {
			leftFork.grab();
			System.out.println("Philosopher #" + number + " grabs left fork.");
			rightFork.grab();
			System.out.println("Philosopher #" + number + " grabs right fork.");
			eat();
			leftFork.release();
			System.out.println("Philosopher #" + number + " releases left fork.");
			rightFork.release();
			System.out.println("Philosopher #" + number + " releases right fork.");
		}
	}

	void eat() {
		try {
			int sleepTime = ThreadLocalRandom.current().nextInt(0, 1000);
			System.out.println("Philosopher #" + " eats for " + sleepTime);
			Thread.sleep(sleepTime);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}