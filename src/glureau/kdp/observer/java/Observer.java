package glureau.kdp.observer.java;

/**
 * This is the abstract interface for updating objects that are interested to
 * changes in the state of a Subject 
 */
public interface Observer {
	
	void update(Subject subject);
}
