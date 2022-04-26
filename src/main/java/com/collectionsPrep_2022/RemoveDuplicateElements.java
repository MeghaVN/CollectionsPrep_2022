package com.collectionsPrep_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		
	ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,3,4,5,6));
	//1.LinkedHashSet
	
	LinkedHashSet<Integer> linkedNumberSet= new LinkedHashSet<Integer>(numbers);//pass the arraylist
	System.out.println(linkedNumberSet);
	
	ArrayList<Integer> numberListWithoutDuplicates= new ArrayList<Integer>(linkedNumberSet);
	System.out.println(numberListWithoutDuplicates);
	
	//JDK - 8- streams
	
	ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,3,4,5,6));
	List<Integer>marksListUnique=marksList.stream().distinct().collect(Collectors.toList());
	System.out.println(marksListUnique);
	
	
	ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("aa","aa","bb"));
		ArrayList<String> uniqueNameList=(ArrayList<String>) nameList.stream().distinct().collect(Collectors.toList());
	System.out.println(uniqueNameList);
	
	
	
	}

}
