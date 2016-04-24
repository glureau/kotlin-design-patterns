package glureau.kdp.behavioral.iterator.java;

public class ConcreteIterator implements Iterator {
	
	private ConcreteAggregate iterable;
	private int currentIndex;

	public ConcreteIterator(ConcreteAggregate iterable) {
		this.iterable = iterable;
		currentIndex = 0;
	}

	@Override
	public Object first() {
		return iterable.getPlaceAtPosition(0);
	}

	@Override
	public Object next() {
		Place result = iterable.getPlaceAtPosition(currentIndex);
		currentIndex++;
		return result;
	}

	@Override
	public boolean hasMore() {
		Object item = iterable.getPlaceAtPosition(currentIndex);
		return item != null;
	}
}
