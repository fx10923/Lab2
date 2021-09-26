package vn.edu.iterator_pattern.iterators;

import vn.edu.iterator_pattern.entities.Student;

public interface Iterator {
	boolean hasNext();
	
	boolean hasBackOne();
	
	Student getNext();
	
	Student getBackOne();
	
	void resetIndex();
}
