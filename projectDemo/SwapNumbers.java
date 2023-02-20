package projectDemo;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		  
		Scanner input =new Scanner(System.in);	
		System.out.println("Enter number1:");
		int num1=input.nextInt();
		
		System.out.println("Enther number2:");
		int num2=input.nextInt();
		
		
		System.out.println("Before swap the number"+num1+" "+num2);
		int tem=0;
		tem=num1;
		num1=num2;
		num2=tem;
		
		System.out.println("After swap the number:"+num1+" "+num2);

	}

}
