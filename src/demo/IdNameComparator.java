package demo;

import java.util.Comparator;

public class IdNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSid()-o2.getSid()>1) {
			return 1;
		}else if(o1.getSid()-o2.getSid()<1) {
			return -1;
		}else {
			return o1.getName().compareTo(o2.getName());
		}
	
	
}
	
	
}	
	
