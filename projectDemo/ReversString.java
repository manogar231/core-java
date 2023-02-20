package projectDemo;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the word:");
		String  num=sc.next();
		String str=num;
		String rev=" ";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}           
		      
		System.out.println("The revered value is : "+rev);
		
		
	}


}
