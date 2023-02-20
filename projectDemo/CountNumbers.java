package projectDemo;

import java.util.Scanner;
// Here checking the number's digits and again getting a number froome user 
//And check the number is Even or Odd
public class CountNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nubmer you wnat to count ");
		int num=sc.nextInt();
		
		int count=0;
		while(num>0) {
			
			num=num/10;
			count++;
		}
		
		System.out.println("The count of the Number is:"+count);
		System.out.println(" ");		
		System.out.println("Enter the number to check if it is even or odd");
		int num2=sc.nextInt();
		
		if(num2%2==0) {
			
			System.out.println("The is even number");
		}else {
			System.out.println("The is odd number");
		}

	}

}
