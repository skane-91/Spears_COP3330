package spears_p3;
import java.util.Scanner;

/*
 * Write a simple polling program that allows users to 
 * rate five topics from 1 (least important) to 10 (most 
 * important). Pick five topics that are important to 
 * you (e.g., political issues, global environmental 
 * issues, food, video games). Use a one-dimensional 
 * array topics (of type String) to store the five issues. 
 * To summarize the survey responses, use a 5-row, 
 * 10-column two-dimensional array responses (of type int), 
 * each row corresponding to an element in the topics array. 
 * When the program runs, it should ask the user to rate each 
 * issue. Multiple people should be able to respond to the 
 * survey during a single run of the program. Once all 
 * responses have been logged, have the program display a 
 * summary of the results...
 */

public class PollProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"Food", "Money", "Soccer", "Books", "Friends"};
		int[][] ratings = new int[topics.length][];
		int people, rating, i, j;
		
		for (i = 0; i < ratings.length; i++) {
			ratings[i] = new int[10];
			for (j = 0; j < ratings[i].length; j++) {
				ratings[i][j] = 0;
			}
		}
		
		System.out.print("Enter the number of respondents: ");
		people = scnr.nextInt();
		
		for (i = 0; i < people; i++) {
			System.out.println("Rate each topic on a scale of 1 - 10 for the " + topics.length + " topics below: ");
			for (j = 0; j < topics.length; j++) {
				System.out.print("Enter your rating for " + topics[j] + ": ");
				rating = scnr.nextInt();
				while (rating < 1 || rating > 10) {
					System.out.println("Rating should be from 1 - 10");
					System.out.print("Enter your raiting for " + topics[j] + ": ");
					rating = scnr.nextInt();
				}
				ratings[j][rating - 1]++;	
			}
		}
		
		int avgRating[] = new int[topics.length];
		String highestPointTopic = "", lowestPointTopic = "";
		int highestPointTotal = 0, lowestPointTotal = 0;
		
		for (i = 0; i < ratings.length; i++) {
			avgRating[i] = 0;
			for (j = 0; j < ratings[i].length; j++) {
				avgRating[i] += (ratings[i][j] * (j + 1));
			}
			if (i == 0) {
				highestPointTotal = avgRating[i];
				lowestPointTotal = avgRating[i];
				highestPointTopic = topics[i];
				lowestPointTopic = topics[i];
			}
			else {
				if (avgRating[i] > highestPointTotal) {
					highestPointTopic = topics[i];
					highestPointTotal = avgRating[i];
				}
				if (avgRating[i] < lowestPointTotal) {
					lowestPointTopic = topics[i];
					lowestPointTotal = avgRating[i];
				}
			}
			avgRating[i] = avgRating[i] / people;
		}
		
		System.out.printf("\n%-20s","");
		for (i = 0; i < 10; i++) {
			System.out.printf("%-10d", (i + 1));
		}
		
		System.out.printf("%20s","Average Rating");
		System.out.println();
		
		for (i = 0; i < ratings.length; i++) {
			System.out.printf("\n%-20s", topics[i]);
			for (j = 0; j < ratings[i].length; j++) {
				System.out.printf("%-10d", ratings[i][j]);
			}
			System.out.printf("%20d", avgRating[i]);
		}
		
		System.out.println("\n\nHighest total points: " + highestPointTotal + "\nTopic: " + highestPointTopic);
		System.out.println("\nLowest total points: " + lowestPointTotal + "\nTopic: " + lowestPointTopic);
		
		scnr.close();
	}
}
