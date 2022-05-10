

package com.tns.day61;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args) 
	{
		ArrayList<Student> al =new ArrayList<Student>();
		
		List<Student> la = new ArrayList<Student>();
		List<Student> lv= new Vector<Student>();
		List<Student> l = new LinkedList<Student>();
		
		Student s1 = new Student(1,"Rushi",12);
		Student s2 = new Student(2,"Mandar",13);
		Student s3 = new Student(3,"Swapnil",13);
		Student s4 = new Student(4,"Rutik",15);
		Student s5 = new Student(5,"Aniket",19);
		Student s6 = new Student(6,"Harshal",13);
		Student s7 = new Student(7,"Siddhu",15);
		Student s8 = new Student(8,"Minal",17);
		Student s9 = new Student(9,"Vinit",18);
		Student s10 =new Student(10,"Vedant",16);
		Student s11 = new Student(11,"Bhavesh",18);
		Student s12 = new Student(12,"Roshan",13);
		Student s13 = new Student(13,"Divya",12);
		Student s14 = new Student(14,"Rushi",12);
		
		al.add(s1);
		al.add(s14);
		System.out.println(al.size());
		
		al.remove(s14);
		System.out.println(al.size());
		System.out.println(al.contains(s14));
		
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al.size());
		
		Iterator <Student> it = al.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
		
		Stream <Student> ss = al.stream();
		System.out.println(ss);
		System.out.println("----------------------------");
		
		al.stream().forEach(System.out::println);
		
		System.out.println(al.stream().mapToDouble(Student::getMarks).average());
		
		OptionalDouble od = al.stream().filter((s)-> s.getMarks()<14).mapToDouble(Student::getMarks).average();
		System.out.println(od);
		
		System.out.println("Min Mark ="+al.stream().min(Comparator.comparing(Student::getMarks)));
		
		System.out.println(al.stream().filter((s)-> s.getMarks()< 20).map((s)-> s.getMarks()).collect(Collectors.toSet()));
	}
}