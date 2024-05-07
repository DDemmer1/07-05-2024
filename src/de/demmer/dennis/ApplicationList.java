package de.demmer.dennis;

import java.util.ArrayList;

public class ApplicationList {

	public static void main(String[] args) {
		
		int i1 = 1;
		
		Integer i = 2;
		
		i.longValue();
		
//		--------------------
		
		
		int[] intArray = new int[10];
		intArray[0] = 5;
		
		//STRG + SHIFT + O -> auto-import
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		intList.add(4);
		intList.add(7);
		
		intList.remove(0);
		
		System.out.println(intArray[0]);
		System.out.println(intList.get(0));
		
		int l = intArray.length;
		int listLenght = intList.size();
		
		intList.contains(5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
