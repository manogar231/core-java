package projectDemo;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number here:");

		int number=sc.nextInt();
		int sum=0;
		while(number>0) {
			
	     sum=sum+number%10;  //here the(number%10) give you the last digits of number and we add it
	     //first we declare sum=0 then we add here(sum=sum+number%10)the last digits  
	     number=number/10; //this will eliminate the last number 
		}
		
		System.out.println("The sum of the digits are"+" "+sum);
		
		
	}

}
