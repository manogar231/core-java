package projectDemo;
import java.util.Scanner;
public class Palindrome {
	
	//Palindrome the given number

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the value here:");
     int val=sc.nextInt();
     int reval=val;
     System.out.println("The given number is:"+ val);
     int  tem=0;
     
		while(val!=0) {
			
			tem=tem*10 +val%10;
			val=val/10;
		}

     if(reval==tem) {
    	 
    	 System.out.println(" The value is palindrome: ");
    	 
     }else {
    	 
    	 System.out.println(" The value is not palindrome ");
     }
     

	}

}
