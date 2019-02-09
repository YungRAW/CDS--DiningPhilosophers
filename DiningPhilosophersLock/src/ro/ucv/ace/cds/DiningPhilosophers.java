/**
 * Problema Filozofilor, varianta cu zavoare explicite.
 * In aceasta clasa vom instantia obiectele si vom rula threadurile pt rezolvarea problemei
 * 
 * 
 * 
 * 
 * @author Razvan
 */
package ro.ucv.ace.cds;
public class DiningPhilosophers {

	static Philosopher philosophers[] = new Philosopher[5];
	static Fork forks[] = new Fork[5];

	public DiningPhilosophers() {

	}

	public static void main(String argv[]) {

		for (int i = 0; i < 5; i++) {
			forks[i] = new Fork();
		}

		for (int i = 0; i < 5; i++) {
			philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % 5]); // initializam fil
			philosophers[i].start();
		}
	}
}