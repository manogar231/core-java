package projectDemo;
import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the 1st number");
       int number1 =sc.nextInt();
       System.out.println("Enter the 2d number");
       int number2 =sc.nextInt();
       System.out.println("Enter the 3rd number");
       int number3 =sc.nextInt();  //getting 3 number form user
       
       //abc
            //a>b and a>c
        if(number1>number2&&number1>number3) {
        	
        	System.out.println("number one is largest:"+" "+number1);
        }
        //here b>a and b>c
       if(number2>number1&&number2>number3) {
    	   System.out.println("number two is largest:"+" "+number2);
    	   
       }
       //here c>a and c>b
       if(number3>number1&&number3>number2) {
    	   
    	   System.out.println("number three is largest:"+" "+number3);
       }
       else {
    	   
    	   System.out.println("The numbers are equal");
       }
       
       
       
	}

}
