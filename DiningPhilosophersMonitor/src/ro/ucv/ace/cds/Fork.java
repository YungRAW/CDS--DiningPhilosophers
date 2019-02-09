package ro.ucv.ace.cds;
import javax.management.monitor.Monitor;

public class Fork {

	public Monitor monitor; //or we can just put the auto-implemented methods wait() 
							//and notify() without invvoking and object of Monitor class 

	Fork() {

	}

	synchronized void grab() {
		try {
			monitor.wait(); // or just wait();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	synchronized void release() {
		monitor.notify(); //or just notify();
	}


}
