package com.collectionsPrep_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//1. Collections.synchronizedList() -> return synchronized list
//2. copyOnWriteArrayList  -class -thread safe variant of ArrayList



public class synchronizedArrayList {
	
	public static void main(String[] args) {
		
		//copyOnWriteArrayList-> thread safe
		
		List<String> namesList=Collections.synchronizedList(new ArrayList<String>());
		
		namesList.add("java");
		namesList.add("python");
		namesList.add("csharp");
		
		//add, remove -> we dont need explicit synchronization
		//fetch/traverse- the value from the list-> need explicit synchronization
		
		synchronized (namesList)
		{
			Iterator<String> itr = namesList.iterator();
			while(itr.hasNext())
			{
				String name=itr.next();
				System.out.println(name);
			}
		}
		
		
		//copyOnWriteArrayList -> its a class
		
		CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();
		emplist.add("tom");
		emplist.add("steve");
		emplist.add("megha");
		
		//we dont need any explicit synchronization for any operation : add/remove/traverse
		Iterator<String> itr1 = emplist.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	}

}
