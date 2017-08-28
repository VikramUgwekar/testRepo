package com.collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
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
	
	Map<String, Student> studentMap = new HashMap<>();
	
	
	
	studentMap.put("Science", e);
	studentMap.put("Commerce", e1);
	studentMap.put("Literature", e2);
	studentMap.put("Mathemtaics", e3);
	studentMap.put("Science", e);
	
	Map<String, Student> studentTreeMap = new TreeMap<String, Student>(studentMap);
	
	Map<String, Student> studentCopmMap = new TreeMap<String, Student>((Comparator<String>) (o1, o2) -> o1.compareTo(o2));
	studentCopmMap.putAll(studentTreeMap);
	CollectionTest collectionTest = new CollectionTest();
	collectionTest.printMap(studentMap);
	collectionTest.printMap(studentTreeMap);
	collectionTest.printMap(studentCopmMap);
	
	
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

	
	public void printMap(Map<String, Student> map){
		
		System.out.println("---------Map Output-+--------");
		System.out.println(map.size());
		for(Map.Entry<String, Student> entry : map.entrySet()){
			String key = entry.getKey();
			Student value = entry.getValue();
			
			System.out.println("Key : "+key+"  "+"Value : "+value.getFirst_name());
			
		}
		}
}
