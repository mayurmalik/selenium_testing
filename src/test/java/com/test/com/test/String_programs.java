package com.test.com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class String_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String test1= "my name is chinmay and im very talented";
		String test2="";
		
		String[] array1= test1.split(" ");
		
	
		
		for(int i=0 ; i<array1.length; i++) {
			
			if(Pattern.matches("[a-zA-Z]", array1[i].substring(0, 1))) {
				
			
			
			test2+= array1[i].substring(0, 1).toUpperCase()+array1[i].substring(1)+ " ";
			
			}
			else {
				
				test2+=array1[1] + " ";
			}
			
			
		}
		
		System.out.println(test2);
		
	
	
//	java program to reverse the every word of string after preserving the space
	
	String second= "my name is mayur and IM not talented";
	
	
    String[] array3= second.split(" ");
    
    String reverse="" ;
    
    for(int j=0; j<array3.length; j++) {
    	
    	StringBuilder sb= new StringBuilder(array3[j]);
    	
    	
    	
    	reverse+=sb.reverse().toString() + " " ;
    	
    	
    	
    	
    }
    
    System.out.println(reverse);
    
    String reversecomp="";
    
    for(int k=0; k<array3.length; k++) {
    	
    	String words= array3[k];
    	String revereseword="";
    	
    	for(int l=words.length()-1; l>=0; l--) {
    		
    		revereseword+=words.charAt(l) ;
    		
    		
    	}
    	
    	reversecomp+=revereseword + " " ;
    	
    }
    
    System.out.println(reversecomp);
	}
}
