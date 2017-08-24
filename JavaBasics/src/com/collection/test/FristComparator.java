package com.collection.test;

import java.util.Comparator;

public class FristComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getFirst_name().compareTo(o2.getFirst_name());
	}

}
