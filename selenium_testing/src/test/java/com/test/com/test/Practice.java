package com.test.com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String t1="test the data with new frequecy";
//
//char[] array1= t1.toCharArray();
//
//HashMap<Character, Integer> h1= new HashMap<Character, Integer>();
//
//for(char c : array1) {
//	
//	if(h1.containsKey(c)) {
//		
//		h1.put(c, h1.get(c)+1);
//	}
//	
//	else {
//		h1.put(c, 1);
//	}
//}
//
//System.out.println(h1);
//
////find the duplicate number of charcter occurence in string 
//
//String t2="test the data with new frequecy";
//
//char[] array2= t2.toCharArray();
//
//HashMap<Character, Integer> h2= new HashMap<Character, Integer>();
//
//for(char c1 : array2) {
//	
//	if(h2.containsKey(c1)) {
//		
//		h2.put(c1, h2.get(c1)+1);
//	}
//	
//	else {
//		h2.put(c1, 1);
//	}
//}
//
//System.out.println(h2);
//
////Getting a Set containing all keys of charCountMap
//
//Set<Character> charsInString = h2.keySet();
//
//for (Character ch : charsInString)
//{
//    if(h2.get(ch) > 1)
//    {
//        //If any char has a count of more than 1, printing it's count
//
//        System.out.println(ch +" : "+ h2.get(ch));
//    }
//}
//
//
//// to check the number of occurence of word in java 
//
//String test5="Java is very powerful langugae java has to do java poerful";
//
//String[] Array222= test5.split("" );
//
//
//
// //to check duplicate elements in array		
//int[] array12= {2,3,4,5,6,78,2,4,5,78,23};
//
//Set<Integer> s1= new HashSet<Integer>() ; 
//
// 
//
//for(int i=0; i<array12.length; i++) {
//	
//	if(s1.add(array12[i])== false) {
//		
//		
//		
//		System.out.println("duplicated elements are "+array12[i] );	
//	}
	
	
	int[] array123= {2,3,4,5,6,78,2,4,5,78,23};
	
	HashMap<Integer, Integer> h123= new HashMap<Integer, Integer>();
	
	for(int a1 : array123) {
		
		if(h123.containsKey(a1)) {
			
			h123.put(a1, h123.get(a1)+1);
		}
		
		else {
			
			h123.put(a1, 1);

		}
		
	}
	
	System.out.println(h123);
	
// getting the key values in the set
	
	Set<Integer> setnew = h123.keySet();
	
	for(Integer i2 : setnew) {
		
		if(h123.get(i2)>1) {
			
			System.out.println(i2+ "duplicate count in array is "+ h123.get(i2));
		}
	}
	
}






		
	}
	
	
	
	
	
	
	
	

