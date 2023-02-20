package projectDemo;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
       
		  String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a word to check  is a palindrome or not");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("The word is a palindrome.");  
	      else  
	         System.out.println("The word is not a palindrome.");  
	      
	
		}
	}
	
