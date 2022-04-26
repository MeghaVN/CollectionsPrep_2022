package com.collectionsPrep_2022;

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		
		//arrayList - dynamic array
		//int i[] = new int[4];//static array
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(1);//0
		ar.add("megha");//1
		ar.add('c');//2
		System.out.println(ar);//3
		
		System.out.println(ar.get(2));
		/*
		 * System.out.println(ar.get(6));//exception
		 * System.out.println(ar.get(-1));//same exception
		 */		System.out.println(ar.size());
		 
		 ar.add(400);
		 ar.add(500);
		 System.out.println(ar.size());
		
	}

}
