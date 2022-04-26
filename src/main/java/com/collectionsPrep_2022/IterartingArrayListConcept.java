package com.collectionsPrep_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterartingArrayListConcept {
	
	public static void main(String[] args) {
		
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("tom");
		studentList.add("steve");
		studentList.add("megha");
		studentList.add("john");
		
		for(int i=0;i<studentList.size();i++)
		{
			
			 System.out.println(studentList.get(i));
			
		}
		System.out.println("---------------");
		//for each
		
		for(String student : studentList)
		{
			System.out.println(student);
		}
		//lambda function - JDK-8
		System.out.println("--------lamda-------------------");
		studentList.stream().forEach(ele->System.out.println(ele));
		//iterator
		
		System.out.println("----------------iterator---------------");
		Iterator<String> itr = studentList.iterator();
		while(itr.hasNext())
		{
			String studentValue=itr.next();
			System.out.println(studentValue);
		}
		//list with other collection 
		System.out.println("creating array list with other arraylist");
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("megha","vn","aaa"));
		System.out.println(names);
	}

}
