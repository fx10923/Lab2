package vn.edu.iterator_pattern.service;

import vn.edu.iterator_pattern.entities.Organization;
import vn.edu.iterator_pattern.entities.Student;
import vn.edu.iterator_pattern.iterators.Iterator;

public class Services {
	private Organization organization;
	private Iterator iterator;
	
	public Services(Organization organization) {
		this.organization = organization;
	}
	
	public Student sertByName(String stdName) {
		iterator = organization.createIterator();
		while (iterator.hasNext()) {
			Student student = iterator.getNext(); 
			String name = student.getName();
			if (name.equals(stdName)) {
				return student;
			}
		}
		return null;
	}
	
	public Student sertById(String id) {
		iterator = organization.createIterator();
		while (iterator.hasNext()) {
			Student student = iterator.getNext(); 
			String temp_id = student.getId();
			if (id.equals(temp_id)) {
				return student;
			}
		}
		return null;
	}
	
	public void showAll() {
		iterator.resetIndex();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext());
		}
	}
	
}
