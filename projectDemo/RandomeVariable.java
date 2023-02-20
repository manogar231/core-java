package projectDemo;
import java.util.Random;
import java.util.Scanner;
public class RandomeVariable {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number Here:");
		int r=sc.nextInt();           //getting number range form the user
		Random rand=new Random();     // create random method
		int value=rand.nextInt(r);    // create integer name value and call the randome method
		
		System.out.println("The Random number is:"+ value); // print the randome value	
		
		
	}

	}


