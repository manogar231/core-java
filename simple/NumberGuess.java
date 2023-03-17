package projectDemo;

import java.util.Scanner;

class Game {
	 
	 public void startgame() {
		 
	 System.out.println("Start the game!!");
	 Scanner input=new Scanner(System.in);
	 //create random number here using math.random() method
	 int number =(int)(100* Math.random());	 
	 int i;
	 int numberoftry=5;
	 System.out.println("guess the number and you have 5 try to guess the number:");
	 System.out.println(" ");
	 //itrator number of try here using for loop
	 for(i=0;i<numberoftry;i++) {
		 
		 System.out.println("Enter your Number Here");
		 //take a number from user to guess
		 int userguess= input.nextInt();
		 if (number== userguess) {
			 System.out.println("Great!! you guess the number");
			 break;
		 }
		 else if (userguess<number && i!=numberoftry) {
			 
			 System.out.println("The number is greater than "+" "+ userguess);
			 
		 }else if (userguess>number && i!=numberoftry) {
			 System.out.println("The number is less than"+" "+ userguess);
			 
		 }
	 }

	 if( i==numberoftry) {
		 System.out.println("Sorry!!your out of move ");
		 System.out.println(" ");
		 System.out.println("The number is "+""+number);
	 }
 }
}

public class NumberGuess {

	public static void main(String[] args) {

		Game game=new Game();
		
		game.startgame();
		
	}

}
