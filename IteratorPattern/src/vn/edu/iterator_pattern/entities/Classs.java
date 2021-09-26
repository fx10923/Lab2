package vn.edu.iterator_pattern.entities;

import java.util.List;

import vn.edu.iterator_pattern.iterators.ClasssIterator;
import vn.edu.iterator_pattern.iterators.Iterator;

public class Classs implements Organization {
	private List<Student> studens;
	
	public Classs(List<Student> students) {
		this.studens = students;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ClasssIterator(this);
	}
	
	public List<Student> getStudents() {
		return this.studens;
	}
	
	public void setStudents (List<Student> students) {
		this.studens = students;
	}
}
