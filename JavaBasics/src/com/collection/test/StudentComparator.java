package com.collection.test;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getId()-o2.getId();
	}

}
