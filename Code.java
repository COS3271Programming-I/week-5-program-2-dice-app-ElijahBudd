package myProject;
import java.util.Scanner;

public class Dice_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter (roll) to roll the dice: ");
			String userRoll = userinput.nextLine();
			
			if(userRoll.equalsIgnoreCase("roll")) {
				int die1 = (int)(Math.random() * 6) + 1;
				int die2 = (int)(Math.random() * 6) + 1;
				
				int sum = die1 + die2;
				
				System.out.println("Die 1: " + die1);
				System.out.println("Die 2: " + die2);
				System.out.println(sum);
			}
			else {
				System.out.println("Try again");
			}
			
			System.out.print("Roll again? (y/n): ");
			choice = userinput.nextLine();
		}
		
		userinput.close();
	}
}
