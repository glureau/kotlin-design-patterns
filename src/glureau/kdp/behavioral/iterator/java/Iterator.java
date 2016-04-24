package glureau.kdp.behavioral.iterator.java;

/**
 * Minimal abstract interface for iterators
 */
public interface Iterator {
	
	Object first();
	
	Object next();
	
	boolean hasMore();
}
