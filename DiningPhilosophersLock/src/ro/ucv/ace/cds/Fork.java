package ro.ucv.ace.cds;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {

	ReentrantLock lock ;

	Fork() {

		lock = new ReentrantLock();
	}

	void grab() {
		try {
			if (lock.tryLock())
				lock.lock();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	void release() {
		lock.unlock();
	}


}
