package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		System.out.println("1. ArrayList");
		List<String> nameList = new ArrayList<>();
		System.out.println("Name list size  " + nameList.size());
		System.out.println("Name list :" + nameList);
		
		nameList.add("paritosh");
		nameList.add("Kapil");
		
		System.out.println("Namelist size::" + nameList.size());
		System.out.println("Namelist  ::" + nameList);
		try {
			System.out.println("name at index 2 ::"+ nameList.get(2));
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("error");
		}
		
		
	 
		System.out.println("Main ends");
		System.out.println("Remove ::" + nameList.remove(0) + "People after removing ::" + nameList);
		System.out.println("----------------------------");
		System.out.println("2.hashset");
		Set<Integer> numberSet = new HashSet<Integer>();
		System.out.println("numberSSet Size " + numberSet.size());
		System.out.println("numberSet :: " + numberSet);
		numberSet.add(101);
		numberSet.add(102);
		numberSet.add(103);
		numberSet.add(101);
		numberSet.add(104);
		
		System.out.println("after adding -------");
		System.out.println("numberSSet Size " + numberSet.size());
		System.out.println("numberSet :: " + numberSet);
		
		System.out.println("-----------------------");
		System.out.println("3. TreeSet");
		Set<String> nameTreeSet = new TreeSet<String>();
		System.out.println("nameTreeset size :: "+ nameTreeSet.size());
		System.out.println("nameTreeSet ::"+ nameTreeSet);
		nameTreeSet.add("A");
		nameTreeSet.add("F");
		nameTreeSet.add("T");
		nameTreeSet.add("O");
		
		System.out.println("After adding");
		System.out.println("nameTreeSet :: " + nameTreeSet);
		System.out.println("nametreeset size::" + nameTreeSet.size());
		
		
		
		
		

	}
}
