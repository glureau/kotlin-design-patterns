package glureau.kdp.behavioral.observer.java.variants;

import glureau.kdp.behavioral.observer.java.Observer;
import glureau.kdp.behavioral.observer.java.Subject;

/**
 * Abstract interface for change manager classes, whose responsibilites are
 * to track down the mapping among Subjects and Observers and to implement
 * specific notification policies
 */
public interface ChangeManager {

	void register(Subject subject, Observer observer);

	void unregister(Subject subject, Observer observer);

	void notifyObservers(Subject subject);

}