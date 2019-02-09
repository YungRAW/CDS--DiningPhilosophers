/**
 * Clasa pentru rezolvarea problemei filozofilor folosind semafoare
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
	

		for (int i = 0; i < 5; i++) { // initializam furculitele
			
			forks[i] = new Fork();   
		}

		for (int i = 0; i < 5; i++) {
			
			philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % 5]); //initializam threadurile pt procesor
			philosophers[i].start(); // dam drumul 
		}
	}
}