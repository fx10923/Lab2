package vn.edu.iterator_pattern.iterators;

import java.util.List;

import vn.edu.iterator_pattern.entities.Classs;
import vn.edu.iterator_pattern.entities.Student;

public class ClasssIterator implements Iterator{
	private List<Student> studentds;
	private int currentIndex = 0;
	private Classs clazz;
	
	public ClasssIterator(Classs clazz) {
		this.clazz = clazz;
		setListStudent();
	}
	
	private void setListStudent() {
		this.studentds = this.clazz.getStudents();
	}
	
	@Override
	public boolean hasNext() {
		return currentIndex < studentds.size();
	}

	@Override
	public Student getNext() {
		if (!hasNext()) {
			return null;
		}
		Student student = studentds.get(currentIndex); 
		currentIndex++;
		return student;
	}

	@Override
	public boolean hasBackOne() {
		return currentIndex - 2 >= 0;
	}

	@Override
	public Student getBackOne() {
		if (!hasBackOne()) {
			return null;
		}
		return studentds.get(currentIndex - 2);
	}

	@Override
	public void resetIndex() {
		this.currentIndex = 0;
	}

}
