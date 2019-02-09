/**
 * Problema Filozofilor, folosind Monitoare.
 * 
 * 
 * @author Razvan
 */

package ro.ucv.ace.cds;

public class DiningPhilosophers {

	static int philosophersNumber = 5;
	static Philosopher philosophers[] = new Philosopher[philosophersNumber];
	static Fork forks[] = new Fork[philosophersNumber];

	public DiningPhilosophers() {

	}

	public static void main(String argv[]) {

		for (int i = 0; i < philosophersNumber; i++) {
			forks[i] = new Fork();
		}

		for (int i = 0; i < philosophersNumber; i++) {
			philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % philosophersNumber]);
			philosophers[i].start();
		}

	}
}