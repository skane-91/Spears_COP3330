package com.company;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int randomQuestion(int diff, int type) {
        SecureRandom rand = new SecureRandom();

        int rand1;
        int rand2;

        switch (diff) {
            case 1:
                rand1 = rand.nextInt(10);
                rand2 = rand.nextInt(10);
                break;
            case 2:
                rand1 = rand.nextInt(90) + 10;
                rand2 = rand.nextInt(90) + 10;
                break;
            case 3:
                rand1 = rand.nextInt(900) + 100;
                rand2 = rand.nextInt(900) + 100;
                break;
            default:
                rand1 = rand.nextInt(9000) + 1000;
                rand2 = rand.nextInt(9000) + 1000;
        }
        if (type == 5) {
            type = rand.nextInt(4);
        }
        switch (type) {
            case 1:
                System.out.println("How much is " + rand1 + " plus " + rand2 + "?");
                return rand1 + rand2;

            case 2:
                System.out.println("How much is " + rand1 + " times " + rand2 + "?");
                return rand1 * rand2;

            case 3:
                System.out.println("How much is " + rand1 + " minus " + rand2 + "?");
                return rand1 - rand2;

            default:
                System.out.println("How much is " + rand1 + " divided by " + rand2 + "?");
                return rand1 / rand2;

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int userNum, num, difficulty, problemType, correct = 0, incorrect = 0;
        double average;

        System.out.print("Please enter difficulty level: ");
        difficulty = sc.nextInt();
        while (difficulty < 1 && difficulty > 4) {
            System.out.print("Invalid difficulty level.\nPlease enter difficulty level: ");
            difficulty = sc.nextInt();
        }

        System.out.print("Please choose problem type: ");
        problemType = sc.nextInt();
        while (problemType < 1 && problemType > 4) {
            System.out.print("Invalid difficulty level.\nPlease enter difficulty level: ");
            problemType = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            num = randomQuestion(difficulty, problemType);
            userNum = sc.nextInt();
            Random rand = new Random();
            int randNew = rand.nextInt(4) + 1;
            if (userNum == num) {
                correct++;

                switch (randNew) {
                    case 1:
                        System.out.println("Very good!");
                        break;

                    case 2:
                        System.out.println("Excellent!");
                        break;

                    case 3:
                        System.out.println("Nice work!");
                        break;

                    case 4:
                        System.out.println("Keep up the good work!");
                        break;

                    default:
                        break;
                }
            } else {
                incorrect++;

                switch (randNew) {
                    case 1:
                        System.out.println("No. Please try again.");
                        break;

                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;

                    case 3:
                        System.out.println("Don't give up!");
                        break;

                    case 4:
                        System.out.println("No. Keep trying.");
                        break;

                    default:
                        break;
                }
            }
        }
        average = correct / (correct + incorrect) * 100;
        if (average < 75.0) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }
}

