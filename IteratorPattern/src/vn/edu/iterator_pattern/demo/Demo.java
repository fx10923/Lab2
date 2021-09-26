package vn.edu.iterator_pattern.demo;

import java.util.ArrayList;
import java.util.List;

import vn.edu.iterator_pattern.entities.Classs;
import vn.edu.iterator_pattern.entities.Organization;
import vn.edu.iterator_pattern.entities.Student;
import vn.edu.iterator_pattern.service.Services;

public class Demo {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Quang", "2384H"));
		students.add(new Student("Anh", "JS324"));
		students.add(new Student("Vy", "A9D89"));
		students.add(new Student("Manh", "37AG38"));
		
		Organization organization = new Classs(students);
		Services services = new Services(organization);
		
		System.out.println(services.sertByName("Anh"));
		
		System.out.println("\n======================\n");
		System.out.println(services.sertById("2384H"));
		
		System.out.println("\n======================\n");
		services.showAll();
	}
}
