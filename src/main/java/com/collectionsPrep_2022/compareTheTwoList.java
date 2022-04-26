package com.collectionsPrep_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class compareTheTwoList {
	public static void main(String[] args) {
		
		
		//1.sorting and equals  -> collections.sort and then use equals
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","H","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","H","F","H","K"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","H","F"));
		Collections.sort(l1);
		Collections.sort(l2);
		
		
		System.out.println(l1.equals(l2));//match the contents and return false
		System.out.println(l1.equals(l3));//false - becoz indexing is also compared, so need to sort and then compare
		Collections.sort(l3);
		System.out.println(l1.equals(l3));//true
		
		
		//2.compare two list - find out additional elements -> RemoveAll
		//find additional elelement in the first list -> H and F
		
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","H","F","M"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","M","S"));
		
		//use removeAll-> it will remove all the elements which are common in both the list
		
		l4.removeAll(l5);
		System.out.println(l4);
		
		//3. Missing element: in the first list w.r.t 2nd 
		l5.removeAll(l4);
		System.out.println(l5);
		
		//4. common elements - retainALl
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","python","ruby","csharp","PHP","C++"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","ruby","csharp","PHP","Javascript"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		
		
	}

}
