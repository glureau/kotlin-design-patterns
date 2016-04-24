package glureau.kdp.behavioral.observer.java;

/**
 * This is the abstract interface for handling and notifying Observers
 */
public interface Subject {
	
	void attach(Observer observer);
	
	void detach(Observer observer);
	
	void notifyObservers();
	
	String getJob();
	
	void setJob(String newJob);
	
	double getSalary();
	
	void setSalary(double newSalary);
}
