package ro.ucv.ace.cds;
import java.util.concurrent.Semaphore;

public class Fork {

	public Semaphore s;
	
	volatile int v = 0;
	

	Fork() {

		s = new Semaphore(1);
	}

	void grab() {
		try {
			s.acquire();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
	

	void release() {
		s.release();
	}

	boolean isFree() {
		return s.availablePermits() > 0;
	}

}
