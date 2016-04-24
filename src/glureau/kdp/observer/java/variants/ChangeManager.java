package glureau.kdp.observer.java.variants;

import glureau.kdp.observer.java.Observer;
import glureau.kdp.observer.java.Subject;

/**
 * Abstract interface for change manager classes, whose responsibilites are
 * to track down the mapping among Subjects and Observers and to implement
 * specific notification policies
 */
public interface ChangeManager {

	public abstract void register(Subject subject, Observer observer);

	public abstract void unregister(Subject subject, Observer observer);

	public abstract void notifyObservers(Subject subject);

}