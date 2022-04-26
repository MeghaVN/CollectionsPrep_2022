package com.collectionsPrep_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMathods {
	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("tom");
		ar1.add("jenny");
		ar1.add("john");
		ar1.add("britto");
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("devops");
		ar2.add("testing");
		
		
		/*
		 * ar1.addAll(ar2); System.out.println(ar1);
		 * 
		 * ar1.addAll(2,ar2);//from 2nd index the arraykist2 values will get added to
		 * arraylist1 System.out.println(ar1);
		 * 
		 * 
		 * ar1.clear();//clear the entire arraylist System.out.println(ar1);
		 */
		
		ArrayList<String> cloneList=(ArrayList<String>)ar1.clone();
		ArrayList<String> cloneList1=(ArrayList<String>) ar1.clone();
		System.out.println(cloneList);//clone
		
		System.out.println(ar1.contains("devops"));//contains - based on value/ index
		
		System.out.println(ar1.indexOf("john")>1);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("naveen","john","jia","naveen","tom","naveen"));
		
		int i=list1.lastIndexOf("naveen");//gets the last index of the value in the list
		System.out.println(i);
		
		list1.remove(0);//removes the value from the list at the given index
		System.out.println(list1);
		list1.remove("naveen");
		System.out.println(list1);
		list1.remove("naveen");
		System.out.println(list1);
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9,10));
		
		  numbers.removeIf(num->num%2==1); 
		  System.out.println(numbers); //it will print all the even numbers
		 
		  numbers.removeIf(num->num%2==0);//this will print all the odd numbers
		  System.out.println(numbers);
		  
		  ArrayList<String>namesList = new ArrayList<String>(Arrays.asList("tom","john","siri","tom","george"));
		  
		  //retain the list with the given value
		  namesList.retainAll(Collections.singleton("tom"));
		  System.out.println(namesList);
		  
		  ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9,10,11,12,13,14,15,16));
		  
		  //create a sublist
		  ArrayList<Integer>subList = new ArrayList<Integer>(numbers1.subList(2, 6));//it will give the result starting from 2nd index to 6th value
		  System.out.println(subList);
		  
		  //convert a arraylist to an array
		  
		  ArrayList<String> namesList1= new ArrayList<String>(Arrays.asList("aaa","bbb","ccc","dddd"));
		  
		  Object[] nameArray=namesList1.toArray();
		  System.out.println(Arrays.toString(nameArray));
		  
		  for(Object o :nameArray)
		  {
			  System.out.println((String)o);
		  }
		 
		 		
		
		
		
		
		
		

	}

}
