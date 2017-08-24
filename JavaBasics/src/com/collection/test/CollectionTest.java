package com.collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {
	
	
	public static void main(String[] args){
		
	Student e = new Student();
	Student e1 = new Student();
	Student e2 = new Student();
	Student e3 = new Student();
	Student e4= new Student();
	
	StudentComparator compare = new StudentComparator();
	
	e.setFirst_name("Vikram0");
	e.setId(1);;
	e.setLast_name("Ugwekar");
	
	e1.setFirst_name("Vikram0");
	e1.setId(1);;
	e1.setLast_name("Ugwekar");
	
	
	e2.setFirst_name("Vikram0");
	e2.setId(3);;
	e2.setLast_name("Ugwekar");
	
	e3.setFirst_name("Vikram0");
	e3.setId(4);;
	e3.setLast_name("Ugwekar");
	
	e4.setFirst_name("Vikram0");
	e4.setId(6);;
	e4.setLast_name("Ugwekar");
	
	
	
	Set<Student> students = new HashSet<>();
	
	Set<Student> treeStudent = new TreeSet<>();
	Set<Student> comparatorStudent = new TreeSet<>(compare);
	
	List<Student> list = new ArrayList<>();
	
	
	
	
	students.add(e);
	students.add(e1);
	students.add(e2);
	students.add(e3);
	students.add(e4);
	
	treeStudent.add(e);
	treeStudent.add(e1);
	treeStudent.add(e2);
	treeStudent.add(e3);
	treeStudent.add(e4);
	
	comparatorStudent.add(e);
	comparatorStudent.add(e1);
	comparatorStudent.add(e2);
	comparatorStudent.add(e3);
	comparatorStudent.add(e4);
	
	
	
	
	
	list.add(e);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	
	list.sort((o1, o2) -> o2.getId()-o1.getId());
	System.out.println(students.size());
	System.out.println(students.toString());
	
	System.out.println(list.size());
	System.out.println(list.toString());
	
	System.out.println(treeStudent.size());
	System.out.println(treeStudent.toString());
	
	System.out.println(comparatorStudent.size());
	System.out.println(comparatorStudent.toString());
	
	
	
	
	
	}

}
