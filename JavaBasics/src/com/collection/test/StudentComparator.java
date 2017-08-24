package com.collection.test;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		o1.getFirst_name().compareTo(o2.getFirst_name());
		return 0;
	}

}
