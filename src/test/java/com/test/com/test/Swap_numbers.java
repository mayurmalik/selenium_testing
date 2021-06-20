package com.test.com.test;

import java.util.ArrayList;
import java.util.List;

public class Swap_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	int x=5;
//		int y =10;
//		
//		y=y-x;
//		x=y+x;
//		
//		System.out.println("x value is "+x);
//		System.out.println("y value is "+y);
//	
//	
////	with using temp variable
//	
//	int new_num=x;
//	
//	x=y;
//	
//	y=new_num;
//	
//	
//	System.out.println("x value is "+x);
//	System.out.println("y value is "+y);
		
//		how to reverse an aaray
		
//		int[] a1= {10,20,30,55};
//		
//		int len=a1.length;
//		
//		int[] b1= new int[a1.length];
//		
//		for(int i=0;i<a1.length;i++) {
//			
//			b1[len-1]=a1[i];
//			
//			len=len-1;
//			
//		}
//		
//for(int i=0;i<b1.length;i++) {
//			
//			System.out.println("reversed array is" +b1[i]);
//			
//		}

// how to reverse an string 

//String s1= "what is your name";
//
//String expected="is your name what";
//
//
//
//String[] ss=s1.split(" ");
//
//String[] temp=new String[ss.length];
//
//temp[0]=ss[1];
//
//temp[1]=ss[2];
//
//temp[2]=ss[3];
//
//temp[3]=ss[0];
//
//for(int i=0; i<temp.length;i++) {
//	
//	System.out.println(temp[i]);
//}


  
// program to count number of characters in a string
		
		
		
		
		

//	public static int getdata() {
//		
//		try {
//			System.out.println("1");
//			throw new Exception();
//		}catch(Exception e  ) {
//			System.out.println("2");
//			return 1;
//		}finally {
//			System.out.println("3");
//			return 2;
//		}
//	//	System.out.println("4");
//	//	return 0;
//	}

		
		String s1="My name is mayur";
		


		
		String s4="";
		
		String[] s2=s1.split(" ");
		
		String[] s3= new String[s2.length];
		
		int len=s2.length;
		
		for(int i=0; i<s2.length; i++) {
			
			s3[i]=s2[len-1];
			
			len--;
			
		}
		
		
		String hh=s3[s3.length-2];
		for(int k=0; k<s3.length;k++) {
			
		if(k==s3.length-2) {
			
			s3[k]=s3[k+1];
			
			s3[k+1]=hh;
			
		}
		}

		
		String a="";
for(int l=0; l<s3.length;l++) {
	
//	
	System.out.print(" "+s3[l]);
	
	
	
	
	a+=" "+s3[l];
	
}
	
a=a.trim();

System.out.println(a);

	
	
	}

}
