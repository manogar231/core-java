package projectDemo;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits here");
		int count=sc.nextInt();
		int number1=0;
		int number2=1;
		int number3;
		System.out.print(number1+" "+number2);
		for(int i=2;i<count;++i)//here the for loop start from 2 we already declare the first 2 numbers
		{
			
	    	number3=number1+number2;
		
		    System.out.print(" "+number3);
		
			number1=number2;
			
		    number2=number3;
			
		}
		
		
	}

}
