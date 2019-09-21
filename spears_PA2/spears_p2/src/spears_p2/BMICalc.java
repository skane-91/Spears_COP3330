package spears_p2;
import java.util.Scanner;

/* 
 * UCF COP 3330 - KANE SPEARS
 * PA2, P2
 * 
 * Create a BMI calculator that reads the user’s 
 * weight and height (providing an option for the 
 * user to select which formula to use), and then 
 * calculates and displays the user’s body mass 
 * index. Also, display the BMI categories and 
 * their values from the National Heart Lung and 
 * Blood Institute: http://www.nhlbi.nih.gov/health
 * /educational/lose_wt/BMI/bmicalc.htm so the user 
 * can evaluate his/her BMI.
 */

public class BMICalc {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double bmi = 0.0;
		System.out.println("Please choose a formula.");
		System.out.print("Type 1 for customary or 2 for metric: ");
		int userInput = scnr.nextInt();
		
		if (userInput == 1) {
			System.out.print("Weight (in pounds): ");
			double weight = scnr.nextDouble();
			System.out.print("Height (in inches): ");
			double height = scnr.nextDouble();
			
			bmi = (703 * weight) / (height * height);
			
			System.out.printf("BMI: %.1f\n\n", bmi);
		}
		if (userInput == 2) {
			System.out.print("Weight (in kilograms): ");
			double weight = scnr.nextDouble();
			System.out.print("Height (in meters): ");
			double height = scnr.nextDouble();
			
			bmi = weight / (height * height);
			
			System.out.printf("BMI: %.2f\n\n", bmi);
		}
		
		System.out.println("*******************************");
		System.out.println("*       BMI Categories        *");
		System.out.println("* Underweight   < 18.5        *");
		System.out.println("* Normal weight = 18.5 - 24.9 *");
		System.out.println("* Overweight    = 25 - 29.9   *");
		System.out.println("* Obese         > 30          *");
		System.out.println("*******************************");
		
		if (bmi < 18.5) {
			   System.out.println("Underweight");
			}
			if (bmi >= 18.5 && bmi <= 24.9) {
			   System.out.println("Normal weight");
			}
			if (bmi >= 25 && bmi <= 29.9) {
			   System.out.println("Overweight");
			}
			if (bmi >= 30) {
			   System.out.println("Obese");
		}
	
	}

}
