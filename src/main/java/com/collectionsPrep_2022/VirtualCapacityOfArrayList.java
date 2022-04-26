package com.collectionsPrep_2022;

import java.util.ArrayList;

public class VirtualCapacityOfArrayList {
	public static void main(String[] args) {
		
		ArrayList<Object> ar= new ArrayList<Object>(20);
		System.out.println("Pysical capacity is always 0 and virtual capacticy is 10");
		System.out.println(ar.size());//PC=0
		ar.add(100);
		System.out.println(ar.size());//PC=1
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
	}
	
	
	

}
