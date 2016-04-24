package glureau.kdp.behavioral.iterator.java;

/**
 * Abstract interface for composite objects that must be iterated, providing the
 * factory method for creating Iterators.
 */
public interface Aggregate {
	
	Iterator iterator(String type);
}
