package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList <Student>studentsList= new ArrayList();
		studentsList.add(new Student("Durgesh","123456789",56));
		studentsList.add(new Student("sunil","56789345",29));
		studentsList.add(new Student("ramesh","934456789",43));
		studentsList.add(new Student("singh","934456789",43));
		studentsList.add(new Student("akash","934456799",43));
		System.out.println("---------------origianal list----------------  ");
		System.out.println(studentsList);
		
		
		//comparable 
		//Collections.sort(studentsList);
		
		// sort by using comparator
		Collections.sort(studentsList,new IdComparator());
		System.out.println("------compare using comparator using id------");
		System.out.println(studentsList);
		Collections.sort(studentsList,new IdNameComparator());
		System.out.println("----first comparing using id if ties then compare with name---");
		System.out.println(studentsList);
		
		//sort by name using a Comparator (using a lambda expression)
		Comparator<Student> phoneComparator=(p1,p2)->p1.getPhone().compareTo(p2.getPhone());
		Collections.sort(studentsList,phoneComparator);
		System.out.println("sort by name using a Comparator (using a lambda expression)");
		System.out.println(studentsList);

		
		
	}
}
